package it.polito.ai.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.polito.ai.businesslogic.CartService;
import it.polito.ai.businesslogic.PaymentService;

@WebServlet("/private/checkout/actions")
public class CheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionType = request.getParameter("type");
		CartService cartService = (CartService)request.getSession().getAttribute("cartService");
		PaymentService paymentService = (PaymentService)request.getSession().getAttribute("paymentService");
		if (actionType.equals("create")) {
			// create a checkout from the cart
			paymentService.setCartItem(cartService.getItems());
			// send the client to the checkout page
			response.sendRedirect(request.getContextPath() + "/private/checkout.jsp");
		} else if(actionType.equals("do")) {
			if (paymentService.getPaymentInfo() == null) {
				// TODO provide an error message, payment info are required
				response.sendRedirect(request.getContextPath() + "/private/checkout.jsp");
			} else {
				// proceed with payment
				if (paymentService.pay()) {
					// succeeded
					response.sendRedirect(request.getContextPath() + "/done");
				} else {
					// payment failed
					response.sendRedirect(request.getContextPath() + "/private/checkout.jsp");
				}
				
			}
		}
	}

}
