package orderService;

import java.time.LocalDateTime;

public class MailService implements InformationService {
    @Override
    public void inform(User user, String product, LocalDateTime deliveryDate) {
        System.out.println(user.getName() + " Twoje zamówienie zostało wysłane");
    }
}
