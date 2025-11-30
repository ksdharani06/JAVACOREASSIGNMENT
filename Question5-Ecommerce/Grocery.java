import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Grocery extends Product {

    private LocalDate expiryDate;

    public Grocery(String id, String name, double price, LocalDate expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    double calculateDiscount() {
        long days = ChronoUnit.DAYS.between(LocalDate.now(), expiryDate);

        if (days <= 7) {
            return getPrice() * 0.30;
        } else {
            return getPrice() * 0.10;
        }
    }
}
