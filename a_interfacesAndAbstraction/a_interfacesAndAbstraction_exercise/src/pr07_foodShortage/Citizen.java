package pr07_foodShortage;

public class Citizen implements Buyer{
    public static final int FOOD_INCREASE = 10;
    private String name;
    private int age;
    private String id;
    private String birthdate;
    private int food;

    public Citizen(String name, int age, String id,String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate=birthdate;
        this.food=0;
    }

    @Override
    public void buyFood() {
        this.food+= FOOD_INCREASE;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
