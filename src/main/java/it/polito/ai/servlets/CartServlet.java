package it.polito.ai.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.polito.ai.businesslogic.CartService;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CartService cartService = (CartService) request.getSession().getAttribute("cartService");
		
		String travelDocumentId = request.getParameter("travelDocumentId");
		String quantity = request.getParameter("quantity");
		
		if(cartService != null){
			//Success
			cartService.addItem(travelDocumentId, Integer.parseInt(quantity));
		}else{
			//Fail
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		}

	}

}
