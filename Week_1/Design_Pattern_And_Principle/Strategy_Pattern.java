 interface PaymentStrategy {
    void pay(double amount);
}

 class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with credit card.");
    }
}

 class PayPalPayment implements PaymentStrategy {
    private String emailId;
    private String password;

    public PayPalPayment(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}

 class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}

public class Strategy_Pattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with credit card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/25");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(100.0);

        // Pay with PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john@example.com", "password");
        context.setPaymentStrategy(payPalPayment);
        context.pay(200.0);
    }
}
