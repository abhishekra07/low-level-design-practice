package Online_Shopping_Cart_System.payment;

public class PaypalPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using PayPal.");
    }
}