package pr06_birthdayCelebrations;


public class Citizen implements Identifiable,Birthable{
    private String name;
    private int age;
    private String id;
    private String birthdate;

    public Citizen(String name, int age, String id,String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate=birthdate;
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

    @Override
    public boolean isBirthdate(String birthdate) {
        if (this.birthdate.endsWith(birthdate)){
            return true;
        }
        return false;
    }

    @Override
    public String getBirthdate() {
        return this.birthdate;
    }
}
