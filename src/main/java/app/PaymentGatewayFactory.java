public class PaymentGatewayFactory {
    public PaymentGateway create(String provider) {
        switch (provider) {
            case "paypal":
                return new PayPalGateway();
            case "stripe":
                return new StripeGateway();
            case "skrill":
                return new SkrillGateway();
            default:
                throw new IllegalArgumentException("Unknown payment provider: " + provider);
        }
    }
}