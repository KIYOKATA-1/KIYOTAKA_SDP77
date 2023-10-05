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
    }
