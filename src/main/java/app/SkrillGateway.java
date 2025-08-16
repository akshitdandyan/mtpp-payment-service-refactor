public class SkrillGateway implements PaymentGateway {
    private SkrillClient client;

    public SkrillGateway() {
        this.client = new SkrillClient("skrill_merchant_789");
    }

    @Override
    public boolean pay(double amount, String currency) {
        String result = client.executeTransaction(amount, currency);
        return !result.equals("FAILED");
    }
}