package java8;

public class FoodDeliveryMain {
	
    public static void main(String[] args) {

        // Array of orders
        Order[] orders = {
        		new Order(1, "Pizza"),
                new Order(2, "Burger"),
                new Order(3, "Pasta"),
                new Order(4, "Sandwich"),
                new Order(5, "Biryani")
        };

        // Create threads (agents)
        DeliveryAgent a = new DeliveryAgent("Agent A", orders);
        DeliveryAgent b = new DeliveryAgent("Agent B", orders);
        DeliveryAgent c = new DeliveryAgent("Agent C", orders);

        // Start threads
        a.start();
        b.start();
        c.start();
    }
}