package orderService;
public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new OurOrderService(), new OurOrderRepository());
        productOrderService.process(orderRequest);
    }
}
