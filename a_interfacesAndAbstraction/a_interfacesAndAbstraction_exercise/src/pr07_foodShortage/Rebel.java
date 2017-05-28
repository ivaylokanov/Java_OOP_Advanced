package pr07_foodShortage;

public class Rebel implements Buyer{
    public static final int FOOD_INCREASE = 5;
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
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
