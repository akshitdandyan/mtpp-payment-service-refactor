public class PaymentService {

    public boolean processPayment(Order order) {
        Logger.info("Processing payment for: " + order);

        // BAD: Long switch statement violates Open/Closed Principle
        String provider = Config.getCurrentProvider();
        boolean success = false;

        switch (provider) {
            case "paypal":
                // BAD: Direct instantiation violates Dependency Inversion Principle
                PayPalClient paypalClient = new PayPalClient("paypal_api_key_123");
                success = paypalClient.processPayment(order.getAmount(), order.getCurrency());
                break;

            case "stripe":
                // BAD: Provider-specific argument translation inside service
                StripeClient stripeClient = new StripeClient("stripe_secret_key_456");
                int amountInCents = (int) (order.getAmount() * 100);
                success = stripeClient.charge(amountInCents, order.getCurrency());
                break;

            case "skrill":
                // BAD: Direct instantiation and different return type handling
                SkrillClient skrillClient = new SkrillClient("skrill_merchant_789");
                String result = skrillClient.executeTransaction(order.getAmount(), order.getCurrency());
                success = !result.equals("FAILED");
                break;

            default:
                Logger.error("Unknown payment provider: " + provider);
                return false;
        }

        // BAD: Mixed responsibility - receipt printing should be separate
        if (success) {
            printReceipt(order, provider);
        }

        return success;
    }

    // BAD: Another responsibility mixed in - violates SRP
    private void printReceipt(Order order, String provider) {
        System.out.println("=== PAYMENT RECEIPT ===");
        System.out.println("Provider: " + provider);
        System.out.println("Amount: " + order.getAmount() + " " + order.getCurrency());
        System.out.println("Status: SUCCESS");
        System.out.println("=====================");
    }
}