/**
 * 
 */
package it.polito.ai.businesslogic;

/**
 *
 *
 */
public class PaymentInfo {
	private String method;
	private String creditCard;
	private String billingAddress, city, cap;
	private String organization;
	
	/**
	 * @param method
	 * @param creditCard
	 * @param billingAddress
	 * @param city
	 * @param cap
	 * @param organization
	 */
	public PaymentInfo(String method, String creditCard, String billingAddress, String city, String cap,
			String organization) {
		super();
		this.method = method;
		this.creditCard = creditCard;
		this.billingAddress = billingAddress;
		this.city = city;
		this.cap = cap;
		this.organization = organization;
	}

	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * @param method the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * @return the creditCard
	 */
	public String getCreditCard() {
		return creditCard;
	}

	/**
	 * @param creditCard the creditCard to set
	 */
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	/**
	 * @return the billingAddress
	 */
	public String getBillingAddress() {
		return billingAddress;
	}

	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the cap
	 */
	public String getCap() {
		return cap;
	}

	/**
	 * @param cap the cap to set
	 */
	public void setCap(String cap) {
		this.cap = cap;
	}

	/**
	 * @return the organization
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	
	
}
