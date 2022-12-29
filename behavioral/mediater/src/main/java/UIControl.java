public interface UIControl {

    void setValue(int value, boolean isMediator);

    void controlChangeValue(UIControl control);

    String getName();

    int getValue();
}
