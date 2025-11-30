import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ECommerceSystem {

    public static void main(String[] args) {

        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Electronics("E1", "Laptop", 60000, 2));
        cart.add(new Electronics("E2", "Mobile", 30000, 1));
        cart.add(new Electronics("E3", "TV", 55000, 3));

        cart.add(new Clothing("C1", "Shirt", 1500, "M"));
        cart.add(new Clothing("C2", "Jeans", 2500, "32"));
        cart.add(new Clothing("C3", "Jacket", 4000, "L"));

        cart.add(new Grocery("G1", "Milk", 50, LocalDate.now().plusDays(5)));
        cart.add(new Grocery("G2", "Rice", 1000, LocalDate.now().plusDays(30)));
        cart.add(new Grocery("G3", "Oil", 200, LocalDate.now().plusDays(6)));
        cart.add(new Grocery("G4", "Bread", 40, LocalDate.now().plusDays(3)));

        double total = 0;
        for (Product p : cart) {
            total = total + p.getFinalPrice();
        }

        System.out.println("Total Price After Discount: " + total);

        Collections.sort(cart, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getFinalPrice(), p2.getFinalPrice());
            }
        });

        System.out.println("Products sorted by final price:");
        for (Product p : cart) {
            System.out.println( p.getName() +" Original: " + p.getPrice() +" Final: " + p.getFinalPrice()
            );
        }
    }
}
