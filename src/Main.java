import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clothes store = Clothes.getInstance();
        Payment paymentMethod = null;

        while (true){
            System.out.println("ZARA");
            System.out.println("1. Добавить товар в корзину");
            System.out.println("2. Посмотреть корзину");
            System.out.println("3. Выбрать метод оплаты");
            System.out.println("4. Оплатить покупку");
            System.out.println("5. Выход");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
        }
    }
}