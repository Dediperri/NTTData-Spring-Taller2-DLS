package com.nttdata.spring.services;

import com.nttdata.spring.persistence.NTTDataOrders;
import com.nttdata.spring.persistence.NTTDataProduct;

/**
 * NTTData - Spring - Taller2
 * 
 * Interfaz de servicios de Delivery
 * 
 * @author Diego Lopez Strickland
 */
public interface NTTDataDeliveryManagementServiceI {

	/**
	 * Metodo que permite insertar a nuestro pedido un producto si no existe en este
	 * 
	 * @param
	 */
	public void addProduct(final NTTDataProduct producto, final NTTDataOrders order);

	/**
	 * Metodo que muestra la lista de productos de un pedido y el precio
	 * correspondiente
	 * 
	 * @param
	 */
	public void seeOrderAndProducts(final NTTDataOrders order);

}
