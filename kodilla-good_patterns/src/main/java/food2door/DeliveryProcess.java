package food2door;

public class DeliveryProcess {
    private Store store;
    private Supplier supplier;

    public DeliveryProcess(Store store, Supplier supplier) {
        this.store = store;
        this.supplier = supplier;
    }

    public void order(DeliveryRequest deliveryRequest) {
        if(deliveryRequest.isOrderAcceptation()) {
            store.process(supplier);
            System.out.println("Everything correct, please wait for delivery");
        }
        else {
            System.out.println("Please try again.");
        }
    }
}
