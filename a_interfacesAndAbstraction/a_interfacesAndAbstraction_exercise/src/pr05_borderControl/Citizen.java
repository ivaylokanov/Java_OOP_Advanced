package pr05_borderControl;

public class Citizen implements Identifiable{
    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    @Override
    public boolean getDetained(String detainedId) {
        if (this.id.endsWith(detainedId)){
            return true;
        }
        return false;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
