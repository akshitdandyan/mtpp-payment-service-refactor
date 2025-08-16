public class PayPalGateway implements PaymentGateway {
    private PayPalClient client;

    public PayPalGateway() {
        this.client = new PayPalClient("paypal_api_key_123");
    }

    @Override
    public boolean pay(double amount, String currency) {
        return client.processPayment(amount, currency);
    }
}