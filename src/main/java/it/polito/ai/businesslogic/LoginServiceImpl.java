package it.polito.ai.businesslogic;

public class LoginServiceImpl implements LoginService {
	
	private boolean loggedIn;
	private String username;
	private String password;
	
	public LoginServiceImpl(String username, String password) {
		this.username = username;
		this.password = password;
		this.loggedIn = false;
	}

	public boolean login(String username, String password) {
		loggedIn = (username == this.username && password == this.password);
		return loggedIn;
	}

	public void logout() {
		loggedIn = false;
	}

	public String getUsername() {
		return username;
	}

	public void resetPassword(String username) {
		// TODO
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

}
