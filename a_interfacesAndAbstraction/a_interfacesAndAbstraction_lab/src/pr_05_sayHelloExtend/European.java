package pr_05_sayHelloExtend;

public class European extends BasePerson implements Person{

    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
