import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SomeService1Test {

    @Test
    public void shouldReturnOutcome() {
        SomeService1 someService1 = new SomeService1();

        assertEquals(someService1.getOutcome(), "outcome");
    }
}
