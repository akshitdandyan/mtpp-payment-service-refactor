public class Config {
    private static String currentProvider = "paypal";

    public static String getCurrentProvider() {
        return currentProvider;
    }

    public static void setProvider(String provider) {
        if (provider == null || provider.trim().isEmpty()) {
            throw new IllegalArgumentException("Provider cannot be null or empty");
        }
        currentProvider = provider;
    }
}