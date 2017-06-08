package pr06_birthdayCelebrations;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Birthable> citySubject = new ArrayList<>();
        String input = "";
        while (!"End".equals(input=reader.readLine())){
            String[] inputArgs = input.split("\\s+");
            String commandArgs = inputArgs[0];
            switch (commandArgs){
                case "Robot":
                   continue;
                case "Citizen":
                    String name = inputArgs[1];
                    int age = Integer.valueOf(inputArgs[2]);
                    String id = inputArgs[3];
                    String birthdate = inputArgs[4];
                    Birthable citizen = new Citizen(name,age,id,birthdate);
                    citySubject.add(citizen);
                    break;
                case "Pet":
                    name = inputArgs[1];
                    birthdate = inputArgs[2];
                    Birthable pet = new Pet(name,birthdate);
                    citySubject.add(pet);
                    break;
            }

        }
        String birthDate = reader.readLine();

      citySubject.stream().forEach((c->{
            if (c.isBirthdate(birthDate)){
                System.out.println(c.getBirthdate());
            }
        }));
    }
}
