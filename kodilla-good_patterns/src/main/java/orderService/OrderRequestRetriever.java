package orderService;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user1 = new User("Jan", "Kowalski", "jan.kowalski@poczta.pl");
        String product1 = "playstation 5";
        LocalDateTime deliveryTime1 = LocalDateTime.of(2022,12,10,12, 00);

        return new OrderRequest(user1, product1, deliveryTime1);
    }
}
