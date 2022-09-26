package food2door;

public class HealthyShop implements Store {
    @Override
    public void process(Supplier supplier) {
        System.out.println(supplier.getName() + " accepted the order: " +supplier.getProduct() + " " + supplier.getAmount() + ". ");
    }
}
