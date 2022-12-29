public class LazyInitialization {
    private LazyInitialization() {}

    private static LazyInitialization SINGLE_TON;

    public static LazyInitialization getSingleTon() {
        if (SINGLE_TON == null) {
            synchronized (LazyInitialization.class) {
                if (SINGLE_TON == null) {
                    SINGLE_TON = new LazyInitialization();
                }
            }
        }
        return SINGLE_TON;
    }
}
