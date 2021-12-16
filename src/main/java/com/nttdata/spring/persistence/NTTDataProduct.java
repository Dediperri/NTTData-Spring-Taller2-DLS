package com.nttdata.spring.persistence;

import java.io.Serializable;

/**
 * NTTData - Spring - Taller2
 * 
 * Clase Products
 * 
 * @author Diego Lopez Strickland
 */
public class NTTDataProduct implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** El id de producto (PK) */
	private Long productID;

	/** El nombre del producto */
	private String productName;

	/** El precio con IVA del producto */
	private Float productPriceIVA;

	/** El precio del producto sin IVA */
	private Float productPrice;

	/** El pedido al que este producto esta asociado */
	private NTTDataOrders productOrder;

	/**
	 * @return the productID
	 */
	public Long getProductID() {
		return productID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(Long productID) {
		this.productID = productID;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productPriceIVA
	 */
	public Float getProductPriceIVA() {
		return productPriceIVA;
	}

	/**
	 * @param productPriceIVA the productPriceIVA to set
	 */
	public void setProductPriceIVA(Float productPriceIVA) {
		this.productPriceIVA = productPriceIVA;
	}

	/**
	 * @return the productPrice
	 */
	public Float getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * @return the productOrder
	 */
	public NTTDataOrders getProductOrder() {
		return productOrder;
	}

	/**
	 * @param productOrder the productOrder to set
	 */
	public void setProductOrder(NTTDataOrders productOrder) {
		this.productOrder = productOrder;
	}

}
