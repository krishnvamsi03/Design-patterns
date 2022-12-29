import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCases {

    private UIMediator mediator;
    private UIControl control;
    private UIControl control1;

    @Before
    public void setUp() {
        mediator = new UIMediator();
        control = new TextBox(mediator);
        control1 = new Slider(mediator);
    }

    @Test
    public void testSameValue() {
        control1.setValue(200, false);
        assertTrue(control.getValue() == control1.getValue());
    }
}
