import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.verification.VerificationMode;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SomeControllerTest {

    @Mock
    private SomeService1 someService1;

    @Mock
    private SomeService2 someService2;

    @InjectMocks
    SomeController someController;

    @Test
    public void controllerDestWhatItShouldDo() {
        given(someService1.getOutcome()).willReturn("outcome");
        given(someService2.getResult("outcome")).willReturn("something");

        String result = someController.doSomething();

        assertEquals("something", result);
        verify(someService1, times(1)).getOutcome();
        verify(someService2, times(1)).getResult("outcome");
    }
}
