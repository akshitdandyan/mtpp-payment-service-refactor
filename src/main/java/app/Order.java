public class Order {
    private double amount;
    private String currency;

    public Order(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return String.format("Order{amount=%.2f, currency='%s'}", amount, currency);
    }
}