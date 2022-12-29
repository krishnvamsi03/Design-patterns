public class MediatorMain {

    public static void main(String[] args) {
        UIMediator mediator = new UIMediator();
        UIControl control = new TextBox(mediator);
        UIControl control1 = new Slider(mediator);

        control.setValue(100, false);
        System.out.println(control.getValue() + " " + control1.getValue());
        control1.setValue(200, false);
        System.out.println(control.getValue() + " " + control1.getValue());


    }
}
