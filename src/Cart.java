import java.util.ArrayList;
import java.util.List;
public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    } //Эта часть создает поток данных потом происходит преобразование этого потока

    public void clearCart() {

        products.clear();
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println("Товары в корзине:");
            for (Product product : products) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
        }
    }
}
