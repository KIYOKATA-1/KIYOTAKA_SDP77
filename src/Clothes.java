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
    }
