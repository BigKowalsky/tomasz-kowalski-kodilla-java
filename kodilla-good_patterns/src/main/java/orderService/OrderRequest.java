package orderService;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private String product;
    private LocalDateTime deliveryDate;

    public OrderRequest(final User user, final String product, final LocalDateTime deliveryDate) {
        this.user = user;
        this.product = product;
        this.deliveryDate = deliveryDate;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }
}
