package java8;

public class DeliveryAgent extends Thread {

    private static Order[] orders;
    private static int index = 0;
    private static int deliverCount = 0;
    private static int completeCount = 0;

    private String agentName;

    public DeliveryAgent(String agentName, Order[] ordersArray) {
        this.agentName = agentName;
        orders = ordersArray;
    }

    public void run() {

        while (true) {
            Order order;

            synchronized (DeliveryAgent.class) {
                if (index >= orders.length) break;

                order = orders[index];
                index++;

                deliverCount++;
                System.out.println(agentName + " delivering --> Order ID: "
                        + order.orderId + " (" + order.foodItem + ")");

                if (deliverCount % 3 == 0) {
                    System.out.println();
                }
            }

            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

            synchronized (DeliveryAgent.class) {
                completeCount++;
                System.out.println(agentName + " COMPLETED Order ID: "
                        + order.orderId);

                if (completeCount % 3 == 0) {
                    System.out.println();
                }
            }
        }
    }
}