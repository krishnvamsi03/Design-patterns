public class Slider implements UIControl {
    private int value;
    private UIMediator uiMediator;

    public Slider(UIMediator uiMediator) {
        this.uiMediator = uiMediator;
        this.uiMediator.register(this);
    }

    @Override
    public void setValue(int value, boolean isMediator) {
        this.value = value;
        if (!isMediator) {
            uiMediator.valueChangeByControl(this);
        } else {
            System.out.println("Value change by mediator in slider value " + value);
        }
    }

    @Override
    public void controlChangeValue(UIControl control) {
        setValue(control.getValue(), true);
    }

    @Override
    public String getName() {
        return "SLIDER";
    }

    @Override
    public int getValue() {
        return value;
    }
}
