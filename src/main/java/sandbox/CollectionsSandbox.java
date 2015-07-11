package sandbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class CollectionsSandbox {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		// ArrayList
		ArrayList<Order> currentOrderList = new ArrayList<Order>();
		
		Order currentOrder = new Order();
		currentOrder.setOrderId(1);
		currentOrder.setFirstName("John");
		currentOrder.setLastName("Doe");
		currentOrder.setLocation("San Diego, CA");
		currentOrder.setOrder("pizza");
		currentOrderList.add(currentOrder);

		// Use parameterized constructor
     	Order currentOrder2 = new Order(2, "Jane", "Doe", "Chula Vista, CA", "wings");
		currentOrderList.add(currentOrder2);
		//currentOrderList.remove(0);
		
		for (Order order: currentOrderList) {
			System.out.println("orderId: " + order.getOrderId());
			System.out.println("first name: " + order.getFirstName());
			System.out.println("last name: " + order.getLastName());
			System.out.println("location: " + order.getLocation());
			System.out.println("order: " + order.getOrder());
		}
		
		// HashMap
		Map<String, Order> orderMap = new HashMap<String, Order>();
		orderMap.put("first", currentOrder);
		orderMap.put("second", currentOrder2);
		//orderMap.remove("first");
		
     // Iterator with HashMap
		Iterator orderIt = orderMap.entrySet().iterator();
		while (orderIt.hasNext()) {
			Map.Entry pairs = (Map.Entry)orderIt.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
		
		System.out.println("first orderId in map: " + orderMap.get("first").getOrderId());
		
		// Basic Array
		Order orderArr[] = new Order[2];
		orderArr[0] = currentOrder;
		orderArr[1] = currentOrder2;
		
		for (int i = 0; i < orderArr.length; i++) {
			System.out.println("array item: " + orderArr[i]);
		}
		
		// LinkedList
		List<Order> orderLinkedList = new LinkedList<Order>();
		orderLinkedList.add(currentOrder);
		orderLinkedList.add(currentOrder2);
		
		for (Order orderLink : orderLinkedList) {
			System.out.println("linkedlist item: " + orderLink.toString());
		}
		
	}

}
