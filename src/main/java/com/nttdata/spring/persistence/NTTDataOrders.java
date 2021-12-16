package com.nttdata.spring.persistence;

import java.io.Serializable;
import java.util.List;

/**
 * NTTData - Spring - Taller2
 * 
 * Clase Orders
 * 
 * @author Diego Lopez Strickland
 */
public class NTTDataOrders implements Serializable {

	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = 1L;

	/** ID de pedido (PK) */
	private Long orderID;

	/** Destinatario del pedido */
	private String orderDestinatary;

	/** Direccion de pedido */
	private String orderDirection;

	/** Si esta dentro de la peninsula */
	private Boolean isInPeninsula;

	/** Lista de los productos asociados al pedido */
	private List<NTTDataProduct> orderProducts;

	/**
	 * @return the orderID
	 */
	public Long getOrderID() {
		return orderID;
	}

	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	/**
	 * @return the orderDestinatary
	 */
	public String getOrderDestinatary() {
		return orderDestinatary;
	}

	/**
	 * @param orderDestinatary the orderDestinatary to set
	 */
	public void setOrderDestinatary(String orderDestinatary) {
		this.orderDestinatary = orderDestinatary;
	}

	/**
	 * @return the orderDirection
	 */
	public String getOrderDirection() {
		return orderDirection;
	}

	/**
	 * @param orderDirection the orderDirection to set
	 */
	public void setOrderDirection(String orderDirection) {
		this.orderDirection = orderDirection;
	}

	/**
	 * @return the isInPeninsula
	 */
	public Boolean getIsInPeninsula() {
		return isInPeninsula;
	}

	/**
	 * @param isInPeninsula the isInPeninsula to set
	 */
	public void setIsInPeninsula(Boolean isInPeninsula) {
		this.isInPeninsula = isInPeninsula;
	}

	/**
	 * @return the orderProducts
	 */
	public List<NTTDataProduct> getOrderProducts() {
		return orderProducts;
	}

	/**
	 * @param orderProducts the orderProducts to set
	 */
	public void setOrderProducts(List<NTTDataProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}

	
	
}
