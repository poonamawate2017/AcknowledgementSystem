package com.softtech.entity;

import java.time.LocalDate;

public class OrderHeader {

	private int orderId;
	private String userName;
	private long userMobileNo;
	private String purchaseOrdNo;
	private LocalDate purchaseOrdDate;
	private OrderItems orderItems;
	private Address address;

	public OrderHeader(int orderId, String userName, long userMobileNo, String purchaseOrdNo, LocalDate purchaseOrdDate,
			OrderItems orderItems, Address address) {
		super();
		this.orderId = orderId;
		this.userName = userName;
		this.userMobileNo = userMobileNo;
		this.purchaseOrdNo = purchaseOrdNo;
		this.purchaseOrdDate = purchaseOrdDate;
		this.orderItems = orderItems;
		this.address = address;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public String getPurchaseOrdNo() {
		return purchaseOrdNo;
	}

	public void setPurchaseOrdNo(String purchaseOrdNo) {
		this.purchaseOrdNo = purchaseOrdNo;
	}

	public LocalDate getPurchaseOrdDate() {
		return purchaseOrdDate;
	}

	public void setPurchaseOrdDate(LocalDate purchaseOrdDate) {
		this.purchaseOrdDate = purchaseOrdDate;
	}

	public OrderItems getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "OrderHeader [orderId=" + orderId + ", userName=" + userName + ", userMobileNo=" + userMobileNo
				+ ", purchaseOrdNo=" + purchaseOrdNo + ", purchaseOrdDate=" + purchaseOrdDate + ", orderItems="
				+ orderItems + ", address=" + address + "]";
	}

}
