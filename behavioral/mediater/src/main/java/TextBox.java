public class TextBox implements UIControl {
    private int value;

    private UIMediator mediator;

    public TextBox(UIMediator mediator) {
        this.mediator = mediator;
        this.mediator.register(this);
    }


    @Override
    public void setValue(int value, boolean isMediator) {
        this.value = value;
        if (!isMediator) {
            mediator.valueChangeByControl(this);
        } else {
            System.out.println("Value change by mediator in Text value " + value);
        }
    }

    @Override
    public void controlChangeValue(UIControl control) {
        setValue(control.getValue(), true);
    }

    @Override
    public String getName() {
        return "Textbox";
    }

    @Override
    public int getValue() {
        return value;
    }
}
