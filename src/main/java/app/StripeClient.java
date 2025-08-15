public class StripeClient {
    private String secretKey;

    public StripeClient(String secretKey) {
        this.secretKey = secretKey;
    }

    public boolean charge(int amountInCents, String currencyCode) {
        Logger.log("Stripe charging: " + amountInCents + " cents in " + currencyCode);

        // Simulate API call
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            Logger.error("Stripe charge interrupted");
            return false;
        }

        // Simulate success
        Logger.info("Stripe charge successful");
        return true;
    }

    public String getSecretKey() {
        return secretKey;
    }
}