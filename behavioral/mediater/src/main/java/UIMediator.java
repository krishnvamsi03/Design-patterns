import java.util.LinkedList;
import java.util.List;

public class UIMediator {

    List<UIControl> controls = new LinkedList<>();

    public void register(UIControl control) {
        controls.add(control);
    }

    public void valueChangeByControl(UIControl uiControl) {
        controls.stream().filter(c -> c != uiControl).forEach(c -> c.controlChangeValue(uiControl));
    }
}
