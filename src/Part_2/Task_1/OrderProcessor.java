package Part_2.Task_1;

public class OrderProcessor {
    public void processOrder(Order order) {
        if (isCorrect(order)){
            System.out.println("Order is successfully accepted.");
            orderDetails(order);
        } else {
            System.out.println("Not all required field are correctly filled.");
        }
    }

    private boolean isCorrect(Order order){
        return !order.getCustomerName().isEmpty() && order.getTotalPrice() > 0 && !order.getItems().isEmpty();
    }

    private void orderDetails(Order order){
        StringBuilder details = new StringBuilder();
        details.append("Client name: ").append(order.getCustomerName()).append('\n');

        for (Item item : order.getItems()){
            details.append(item.toString()).append('\n');
        }
        details.append("Total price: ").append(order.getTotalPrice());
        System.out.println(details);
    }
}