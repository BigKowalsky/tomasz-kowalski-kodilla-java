package orderService;

public interface OrderRepository {
    boolean createOrder (OrderRequest orderRequest);
}
