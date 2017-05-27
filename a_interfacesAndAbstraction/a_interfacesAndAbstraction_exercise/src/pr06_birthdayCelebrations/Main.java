package pr06_birthdayCelebrations;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Factory> citySubject = new ArrayList<>();
        String input = "";
        while (!"End".equals(input=reader.readLine())){
            String[] inputArgs = input.split("\\s+");
            String commandArgs = inputArgs[0];
            switch (commandArgs){
                case "Robot":
                    String model = inputArgs[1];
                    String id = inputArgs[2];
                    Factory robot = new Robot(model,id);
                    citySubject.add(robot);
                    break;
                case "Citizen":
                    String name = inputArgs[1];
                    int age = Integer.valueOf(inputArgs[2]);
                    id = inputArgs[3];
                    String birthdate = inputArgs[4];
                    Factory citizen = new Citizen(name,age,id,birthdate);
                    citySubject.add(citizen);
                    break;
                case "Pet":
                    name = inputArgs[1];
                    birthdate = inputArgs[4];
                    Factory pet = new Pet(name,birthdate);
                    citySubject.add(pet);
                    break;

            }

        }
        String birthDate = reader.readLine();


        citySubject.stream().forEach((Birthable c)->{
            if ((Birthable)c.isBirthdate(birthDate)){
                System.out.println((Birthable)c.getBirthdate());
            }
        });
    }
}
