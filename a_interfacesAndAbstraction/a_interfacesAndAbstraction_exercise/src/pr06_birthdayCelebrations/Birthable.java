package pr06_birthdayCelebrations;

public interface Birthable extends Factory {

    boolean isBirthdate(String birthdate);

    String getBirthdate();
}
