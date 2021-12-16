package com.nttdata.spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NTTDataOrders;
import com.nttdata.spring.persistence.NTTDataProduct;

/**
 * NTTData - Spring - Taller2
 * 
 * Implementacion de la Interfaz de servicios de Delivery en Ceuta, Melilla y
 * Canarias
 * 
 * @author Diego Lopez Strickland
 */
@Service
public class NTTDataDeliveryCmcManagementServiceImpl implements NTTDataDeliveryManagementServiceI {

	@Override
	public void addProduct(NTTDataProduct producto, final NTTDataOrders order) {

		// Si no esta en la peninsula
		if (!order.getIsInPeninsula()) {
			// Si la lista es nula no hace nada
			if (order.getOrderProducts() == null) {
				System.out.println("La lista no esta instanciada");
			} else {

				// Si la lista no tiene ya el producto o el producto no esta en otro pedido
				if (!isProductInAnOrder(producto, order)) {
					// Inserto el producto
					order.getOrderProducts().add(producto);
					producto.setProductOrder(order);
				}
			}
		} else {
			System.out.printf(
					"Pedido ID: %s: Este pedido esta en la peninsula y se esta intentando comprobar con el servicio de CMC %n",
					order.getOrderID());
		}

	}

	@Override
	public void seeOrderAndProducts(final NTTDataOrders order) {

		// Si no esta en la peninsula
		if (!order.getIsInPeninsula()) {
			// Creo la lista de los productos
			List<NTTDataProduct> productList = order.getOrderProducts();

			// Itero la lista
			for (NTTDataProduct product : productList) {

				// Le calculo el IPSI
				product.setProductPriceIVA(product.getProductPrice() + (product.getProductPrice() * 0.04f));

				// Devuelvo los productos
				System.out.printf("Producto: %s, PrecioIVA: %s, PrecioSinIva: %s %n", product.getProductName(),
						product.getProductPriceIVA(), product.getProductPrice());
			}
		} else {
			System.out.printf(
					"Pedido ID: %s: Este pedido esta en la peninsula y se esta intentando comprobar con el servicio de CMC %n",
					order.getOrderID());
		}
	}

	/**
	 * Metodo que devuelve verdadero si el producto esta en este pedido o en otro
	 * 
	 * @param
	 * 
	 * @return boolean
	 */
	public boolean isProductInAnOrder(final NTTDataProduct producto, final NTTDataOrders order) {

		if (order.getOrderProducts().contains(producto)) {
			System.out.println("Producto en el pedido");
			return true;
		} else if (producto.getProductOrder() != null) {
			System.out.println("Este producto ya tiene un pedido asociado");
			return true;
		}
		return false;

	}

}
