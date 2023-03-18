package com.softtech.entity;

public class OrderItems {

	private int ordItemId;
	private int productNo;
	private String productName;
	private String productQuantity;
	private String productPrice;

	public OrderItems(int ordItemId, int productNo, String productName, String productQuantity, String productPrice) {
		super();
		this.ordItemId = ordItemId;
		this.productNo = productNo;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}

	public int getOrdItemId() {
		return ordItemId;
	}

	public void setOrdItemId(int ordItemId) {
		this.ordItemId = ordItemId;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "OrderItems [ordItemId=" + ordItemId + ", productNo=" + productNo + ", productName=" + productName
				+ ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + "]";
	}

}
