public class PaymentService {
    private PaymentGatewayFactory factory;

    public PaymentService(PaymentGatewayFactory factory) {
        this.factory = factory;
    }

    public boolean processPayment(Order order) {
        Logger.info("Processing payment for: " + order);

        String provider = Config.getCurrentProvider();
        PaymentGateway gateway = factory.create(provider);
        boolean success = gateway.pay(order.getAmount(), order.getCurrency());

        if (success) {
            printReceipt(order, provider);
        }

        return success;
    }

    private void printReceipt(Order order, String provider) {
        System.out.println("=== PAYMENT RECEIPT ===");
        System.out.println("Provider: " + provider);
        System.out.println("Amount: " + order.getAmount() + " " + order.getCurrency());
        System.out.println("Status: SUCCESS");
        System.out.println("=====================");
    }
}