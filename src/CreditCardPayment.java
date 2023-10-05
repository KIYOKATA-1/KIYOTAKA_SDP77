public class CreditCardPayment implements Payment{
    private String Name;
    private String cardHolderName;

    public CreditCardPayment(String cardHolderName, String cardNumber) {
        this.cardHolderName = cardHolderName;
        this.Name = cardNumber;
        }

        @Override
    public void pay(double amount){
            System.out.println("Оплачено " + amount + " с использованием кредитной карты, номер которой заканчивается на " + Name.substring(Name.length() - 4));
        }
    } // Реализацтя метода Pay из Интерфейса Payment
class CashPayment implements Payment {
    @Override
    public void pay(double amount){
        System.out.println("Оплачено " + amount + " наличными.");
    }
}

//Думаю фулл код относится к Стратегическому Патерну ибо происходит реализация метода pay(double amount) из Интерфейса Payment