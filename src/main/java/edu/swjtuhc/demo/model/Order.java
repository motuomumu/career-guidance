package edu.swjtuhc.demo.model;

import java.util.Date;

import javax.xml.crypto.Data;

public class Order {
	private Long oId;
	private String order;
	private Date submitData=new Date();
	private String submitname;
	public Long getoId() {
		return oId;
	}
	public void setoIdLong(Long oId) {
		this.oId = oId;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public Date getSubmitData() {
		return submitData;
	}
	public void setSubmitData(Date submitData) {
		this.submitData = submitData;
	}
	public String getSubmitname() {
		return submitname;
	}
	public void setSubmitname(String submitname) {
		this.submitname = submitname;
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId+ ", order=" + order + ", submitData=" + submitData + ", submitname="
				+ submitname + "]";
	}
	
	
}
