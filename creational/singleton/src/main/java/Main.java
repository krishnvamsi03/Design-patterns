public class Main {
    public static void main(String[] args) {
        var instance1 = EagerSingleTon.getSingleTon();
        var instance2 = EagerSingleTon.getSingleTon();
        System.out.println(instance2 == instance1);

        var lazySingleTon1 = LazyInitialization.getSingleTon();
        var lazySingleTon2 = LazyInitialization.getSingleTon();
        System.out.println(lazySingleTon2 == lazySingleTon1);

        var holder1 = InitializationHolder.getInstance();
        var holder2 = InitializationHolder.getInstance();
        System.out.println(holder2 == holder1);


    }
}
