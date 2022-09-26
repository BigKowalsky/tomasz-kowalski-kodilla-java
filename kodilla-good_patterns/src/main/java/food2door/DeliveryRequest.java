package food2door;

public class DeliveryRequest {
    private Customer customer;
    private String product;
    private boolean orderAcceptation;

    public DeliveryRequest(Customer customer, String product, boolean orderAcceptation) {
        this.customer = customer;
        this.product = product;
        this.orderAcceptation = orderAcceptation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getProduct() {
        return product;
    }

    public boolean isOrderAcceptation() {
        return orderAcceptation;
    }
}
