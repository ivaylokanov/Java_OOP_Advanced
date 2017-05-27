package pr05_borderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Identifiable> citySubject = new ArrayList<>();
        String input = "";
        while (!"End".equals(input=reader.readLine())){
            String[] inputArgs = input.split("\\s+");
            int countOfArgs = inputArgs.length;
            String id = inputArgs[inputArgs.length-1];
            switch (countOfArgs){
                case 2:
                    String model = inputArgs[0];
                    Identifiable robot = new Robot(model,id);
                    citySubject.add(robot);
                    break;
                case 3:
                    String name = inputArgs[0];
                    int age = Integer.valueOf(inputArgs[1]);
                    Identifiable citizen = new Citizen(name,age,id);
                    citySubject.add(citizen);
                    break;
            }

        }
        String detainedId = reader.readLine();


        citySubject.stream().forEach(c->{
            if(c.getDetained(detainedId)){
                System.out.println(c.getId());
            }
        });
    }
}
