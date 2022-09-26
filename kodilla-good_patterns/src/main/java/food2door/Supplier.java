package food2door;

public class Supplier {
    private String name;
    private String product;
    private int amount;

    public Supplier(String name, String product, int amount) {
        this.name = name;
        this.product = product;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}