public class Clothes {
    private static Clothes instance;

    private Cart cart;

    private Clothes(){
        cart = new Cart();
    }
}
