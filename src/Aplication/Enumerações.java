package Aplication;

import java.util.Date;

import Entities.Order;
import Entities.enums.OrdenStatus;

public class Enumerações {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrdenStatus.PENDING_PAYMENT);

		System.out.println(order);
		
		OrdenStatus os1 = OrdenStatus.DELIVERED;
		
		OrdenStatus os2 = OrdenStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
