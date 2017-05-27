package pr06_birthdayCelebrations;

public class Pet implements Birthable{
    private String name;
    private String birthdate;

    public Pet(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
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
