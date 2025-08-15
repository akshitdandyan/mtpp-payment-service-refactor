public class Config {
    private static String currentProvider = "paypal";

    public static String getCurrentProvider() {
        return currentProvider;
    }

    public static void setProvider(String provider) {
        // BAD: No validation, can be set to any string
        currentProvider = provider;
    }
}