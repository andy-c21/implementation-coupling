import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SomeService2Test {

    @Test
    public void shouldReturnResult() {
        SomeService2 someService2 = new SomeService2();

        assertEquals(someService2.getResult("outcome"), "resultOfoutcome");
    }
}
