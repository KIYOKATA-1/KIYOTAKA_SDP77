public class Clothes {
    private static Clothes instance; //  <-- Это Для Реализации Паттерна Singleton

    private Cart cart; // <-- Это Для Хранения Корзины Покупок

    private Clothes(){
        cart = new Cart();
    } // <-- Это короч Конструктор который инициализирует поле cart как новый объект класса Cart при создании экземпляра Clothes

    public static Clothes getInstance(){
        if(instance == null){
            instance = new Clothes(); // <-- Здесть проверка существует ли экземпляр класса, если нет то новый создает
        }
        return instance;
    } // <-- Это короч сам Паттерн Синглтон

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
            System.out.println("Общая сумма покупки составляет: $" + totalAmount);
        }
        else {
            System.out.println("Корзина Пуста. Добавьте Товар перед оплатой");
        }
    }
    }
