package com.nttdata.spring;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.nttdata.spring.persistence.NTTDataOrders;
import com.nttdata.spring.persistence.NTTDataProduct;
import com.nttdata.spring.services.NTTDataDeliveryCmcManagementServiceImpl;
import com.nttdata.spring.services.NTTDataDeliveryPeninsulaManagementServiceImpl;

/**
 * NTTData - Spring - Taller 2
 * 
 * Clase principal
 * 
 * @author Diego Lopez Strickland
 *
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class NTTDataSpringMain implements CommandLineRunner {

	/** Servicio: gestion de pedidos dentro de la peninsula */
	@Autowired
	private NTTDataDeliveryPeninsulaManagementServiceImpl peninsulaService;

	/** Servicio: gestion de pedidos fuera de la peninsula */
	@Autowired
	private NTTDataDeliveryCmcManagementServiceImpl cmcService;

	/**
	 * Metodo principal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Creo los productos
		NTTDataProduct bebida1 = new NTTDataProduct();
		bebida1.setProductID(1L);
		bebida1.setProductName("Coca-Cola");
		bebida1.setProductPrice(1f);
		
		NTTDataProduct bebida2 = new NTTDataProduct();
		bebida2.setProductID(2L);
		bebida2.setProductName("Sprite");
		bebida2.setProductPrice(1.2f);
		
		NTTDataProduct comida1 = new NTTDataProduct();
		comida1.setProductID(3L);
		comida1.setProductName("Foskitos");
		comida1.setProductPrice(2f);
		
		// Creo los pedidos
		NTTDataOrders pedido1 = new NTTDataOrders();
		pedido1.setOrderID(1L);
		pedido1.setIsInPeninsula(true);
		pedido1.setOrderDestinatary("Pepe");
		pedido1.setOrderDirection("Calle 1 Puerta 20");
		pedido1.setOrderProducts(new ArrayList<NTTDataProduct>());
	
		NTTDataOrders pedido2 = new NTTDataOrders();
		pedido2.setOrderID(2L);
		pedido2.setIsInPeninsula(false);
		pedido2.setOrderDestinatary("Maria");
		pedido2.setOrderDirection("Avenida K Portal 7");
		pedido2.setOrderProducts(new ArrayList<NTTDataProduct>());
		
		// Utilizo los servicios
		peninsulaService.addProduct(comida1, pedido1);
		peninsulaService.addProduct(bebida1, pedido1);
		cmcService.addProduct(bebida1, pedido2);
		cmcService.addProduct(bebida2, pedido2);
		
		peninsulaService.seeOrderAndProducts(pedido1);
		cmcService.seeOrderAndProducts(pedido2);
		
	}
}
