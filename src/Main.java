import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clothes store = Clothes.getInstance();
        Payment paymentMethod = null;

        while (true) {
            System.out.println("ZARA");
            System.out.println("1. Добавить товар в корзину");
            System.out.println("2. Посмотреть корзину");
            System.out.println("3. Выбрать метод оплаты");
            System.out.println("4. Оплатить покупку");
            System.out.println("5. Выход");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Выберите товар для добавления в корзину:");
                    System.out.println("1. Штаны - 41.79USD");
                    System.out.println("2. Худи - 54.31USD");
                    System.out.println("3. Пальто - 181.78USD");
                    System.out.println("4. Куртка - 250.73USD");
                    System.out.println("5. Назад");
                    int productChoice = scanner.nextInt();
                    switch (productChoice) {
                        case 1:
                            store.addToCart(new Product("Штаны", 20.000));
                            break;
                        case 2:
                            store.addToCart(new Product("Худи", 25.990));
                            break;
                        case 3:
                            store.addToCart(new Product("Пальто", 86.990));
                            break;
                        case 4:
                            store.addToCart(new Product("Куртка", 119.990));
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("НЕТ ТАКОГО");
                            break;
                    }
                    break;

                case 2:
                    store.showCart();
                    break;

                case 3:
                    paymentMethod = choosePaymentMethod(scanner);
                    break;

                case 4:
                    if (paymentMethod != null) {
                        store.checkout(paymentMethod);
                    } else {
                        System.out.println("Выберите метод оплаты сначала.");
                    }
                    break;

                case 5:
                    System.out.println("Спасибо за покупки! До свидания!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Некорректный выбор. Пожалуйста, попробуйте еще раз.");
                    break;
            }
        }
    }

    private static Payment choosePaymentMethod(Scanner scanner) {
        System.out.println("Выберите метод оплаты:");
        System.out.println("1. Кредитная карта");
        System.out.println("2. Наличные");

        int paymentChoice = scanner.nextInt();

        switch (paymentChoice) {
            case 1:
                System.out.print("Введите номер кредитной карты: ");
                String cardNumber = scanner.next();
                System.out.print("Введите имя владельца карты: ");
                String cardHolderName = scanner.next();
                return new CreditCardPayment(cardHolderName, cardNumber);

            case 2:
                return new CashPayment();

            default:
                System.out.println("Некорректный выбор. Используется оплата наличными.");
                return new CashPayment();
        }
    }
}
//