package food2door;

public class Application {
    public static void main(String[] args) {
        Store storeHS = new HealthyShop();
        Store storeEFS = new ExtraFoodShop();
        Store storeGFS = new GlutenFreeShop();


        Customer customer001 = new Customer("Jan Nowak", "jan.nowak@poczta.pl");
        Customer customer002 = new Customer("Anna Malinowska", "anna.malinowska@poczta.pl");
        Customer customer003 = new Customer("Jacek Piotrowski", "jacek.piotrowski@poczta.pl");
        Supplier supplier001 = new Supplier("Extra Food Shop", "Extra Dinner Pack", 3);
        Supplier supplier002 = new Supplier("Gluten Free Shop", "Zero Gluten Dinner Pack", 1);
        Supplier supplier003 = new Supplier("Healthy Shop", "Cardio-care Dinner Pack", 5);
        DeliveryRequest del001 = new DeliveryRequest(customer003, supplier002.getProduct(), true);
        DeliveryRequest del002 = new DeliveryRequest(customer001, supplier001.getProduct(), true);
        DeliveryRequest del003 = new DeliveryRequest(customer002, supplier003.getProduct(), false);


        DeliveryProcess deliveryProcess1 = new DeliveryProcess(storeGFS, supplier002);
        DeliveryProcess deliveryProcess2 = new DeliveryProcess(storeHS, supplier003);
        DeliveryProcess deliveryProcess3 = new DeliveryProcess(storeEFS, supplier001);

        deliveryProcess1.order(del003);
        deliveryProcess2.order(del001);
        deliveryProcess3.order(del002);
    }
}
