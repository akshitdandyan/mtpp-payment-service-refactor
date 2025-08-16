public class StripeGateway implements PaymentGateway {
    private StripeClient client;

    public StripeGateway() {
        this.client = new StripeClient("stripe_secret_key_456");
    }

    @Override
    public boolean pay(double amount, String currency) {
        int amountInCents = (int) (amount * 100);
        return client.charge(amountInCents, currency);
    }
}