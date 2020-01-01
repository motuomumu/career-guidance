package edu.swjtuhc.demo.model;

public class Time {
	private Long tId;
	private String starttime;
	private String endtime;
	public Long gettId() {
		return tId;
	}
	public void settId(Long tId) {
		this.tId = tId;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	@Override
	public String toString() {
		return "Time [tId=" + tId + ", starttime=" + starttime + ", endtime=" + endtime + "]";
	}
	

	
}
