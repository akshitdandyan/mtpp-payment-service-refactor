public class SkrillClient {
    private String merchantId;

    public SkrillClient(String merchantId) {
        this.merchantId = merchantId;
    }

    public String executeTransaction(double amount, String currency) {
        Logger.log("Skrill executing transaction: " + amount + " " + currency);

        // Simulate API call
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Logger.error("Skrill transaction interrupted");
            return "FAILED";
        }

        // Simulate success - returns transaction ID instead of boolean
        String transactionId = "SKR" + System.currentTimeMillis();
        Logger.info("Skrill transaction successful: " + transactionId);
        return transactionId;
    }

    public String getMerchantId() {
        return merchantId;
    }
}