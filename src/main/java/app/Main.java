public class Main {
    public static void main(String[] args) {
        System.out.println("=== PAYMENT SYSTEM DEMO ===");
        System.out.println();

        Order order = new Order(19.99, "EUR");
        PaymentGatewayFactory factory = new PaymentGatewayFactory();
        PaymentService paymentService = new PaymentService(factory);

        // Test with PayPal
        System.out.println("Testing PayPal payment:");
        Config.setProvider("paypal");
        boolean paypalResult = paymentService.processPayment(order);
        System.out.println("PayPal result: " + paypalResult);
        System.out.println();

        // Test with Stripe
        System.out.println("Testing Stripe payment:");
        Config.setProvider("stripe");
        boolean stripeResult = paymentService.processPayment(order);
        System.out.println("Stripe result: " + stripeResult);
        System.out.println();

        // Test with Skrill
        System.out.println("Testing Skrill payment:");
        Config.setProvider("skrill");
        boolean skrillResult = paymentService.processPayment(order);
        System.out.println("Skrill result: " + skrillResult);
        System.out.println();

        System.out.println("=== DEMO COMPLETE ===");
    }
}