public class SomeController {

    private SomeService1 someService1;
    private SomeService2 someService2;

    public SomeController(SomeService1 someService1, SomeService2 someService2) {
        this.someService1 = someService1;
        this.someService2 = someService2;
    }

    public String doSomething() {
        String result = someService1.getOutcome();
        return someService2.getResult(result);
    }
}
