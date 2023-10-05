public class Clothes {
    private static Clothes instance;

    private Cart cart;

    private Clothes(){
        cart = new Cart();
    }

    public static Clothes getInstance(){
        if(instance == null){
            instance = new Clothes();
        }
        return instance;
    }

    public void addToCart(Product product) {
        cart.addProduct(product);
        System.out.println(product.getName() + " добавлено в корзину.");
    }
    public void showCart(){
        cart.displayCart();
    }

    public void checkout(Payment paymentMethod) {
        double totalAmount = cart.calculateTotal();
        if(totalAmount > 0){
            System.out.println("Общая сумма покупки составляет: tg" + totalAmount);
        }
        else {
            System.out.println("Корзина Пуста. Добавьте Товар перед оплатой");
        }
    }
    }
