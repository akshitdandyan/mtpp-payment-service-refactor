public class PayPalClient {
    private String apiKey;

    public PayPalClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public boolean processPayment(double amount, String currency) {
        Logger.log("PayPal processing payment: " + amount + " " + currency);

        // Simulate API call
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Logger.error("PayPal payment interrupted");
            return false;
        }

        // Simulate success
        Logger.info("PayPal payment successful");
        return true;
    }

    public String getApiKey() {
        return apiKey;
    }
}