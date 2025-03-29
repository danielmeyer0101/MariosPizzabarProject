import java.util.ArrayList;

public class Product {

    int productNr;
    int price;
    ArrayList<Product> arrayList;

    public Product(int productNr, int price) {
        this.productNr = productNr;
        this.price = price;
    }

    public Product() {
        arrayList = new ArrayList<>();
    }


    public void addProduct(Product p) {
        arrayList.add(p);
    }

    public void showProductInformation() {
        System.out.println("Productnr.: " + this.productNr + ", Price: " + this.price);
    }

    public void showProductlist() {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).showProductInformation();
        }

    }

    public Product getProduct(int index) {
        return arrayList.get(index) ;
    }

}
