import java.time.LocalTime;
import java.util.ArrayList;

public class Order extends Product {

    ArrayList<Order> arrayList;
    LocalTime collectTime;
    String orderStatus;
    int quantity;
    Product product;
    int price;

    public Order() {
        arrayList = new ArrayList<>();
    }

    public Order(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = price;
    }

    public Order(ArrayList<Order> arrayList, LocalTime collectTime, String orderStatus) {
        this.arrayList = arrayList;
        this.collectTime = collectTime;
        this.orderStatus = orderStatus;
    }

    public void showOrder(int index) {
        System.out.println(this.quantity + "x");
    }



}
