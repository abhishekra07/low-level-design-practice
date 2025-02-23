package Online_Shopping_Cart_System.payment;

public class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using Credit Card.");
    }
}