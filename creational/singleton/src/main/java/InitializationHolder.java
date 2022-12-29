public class InitializationHolder {
    private InitializationHolder() {};

    private static class Holder {
        static final InitializationHolder HOLDER = new InitializationHolder();
    }

    public static InitializationHolder getInstance() {
        return Holder.HOLDER;
    }
}
