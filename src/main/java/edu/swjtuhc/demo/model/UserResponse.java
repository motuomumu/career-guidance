package edu.swjtuhc.demo.model;

public class UserResponse {

	private final String token ;
	
	public UserResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
