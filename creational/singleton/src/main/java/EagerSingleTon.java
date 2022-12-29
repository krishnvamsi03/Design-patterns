public class EagerSingleTon {
    private EagerSingleTon() {}

    private static final EagerSingleTon SINGLE_TON = new EagerSingleTon();

    public static EagerSingleTon getSingleTon() {
        return SINGLE_TON;
    }
}
