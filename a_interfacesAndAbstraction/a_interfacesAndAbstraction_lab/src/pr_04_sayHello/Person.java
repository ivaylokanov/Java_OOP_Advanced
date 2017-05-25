package pr_04_sayHello;

public interface Person {
    String getName();

    default String sayHello() {
        return "Hello";
    }

}
