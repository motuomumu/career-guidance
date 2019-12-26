package edu.swjtuhc.demo.model;

public class SysUser {
	private String username;
	private String password;
	private String region;
	private String role;
	private int uid;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "SysUser [username=" + username + ", password=" + password + ", region=" + region + ", role=" + role
				+ ", uid=" + uid + "]";
	}
	
}
