package StreamsS;


public class Oop {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod card = new CreditCard();
        PaymentMethod paypal = new PayPal();

        processor.processPayment(card, 100);
        processor.processPayment(paypal, 200);
    }
}

interface PaymentMethod {
    void pay(double amount);
}

class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " with Credit Card");
    }
}

class PayPal implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " with PayPal");
    }
}

class PaymentProcessor {
    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}


