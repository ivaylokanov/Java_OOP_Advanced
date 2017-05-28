package pr07_foodShortage;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Buyer> persons = new HashMap<>();
        int foodPurchase = 0;
        int numberOfLines = Integer.valueOf(reader.readLine());
        for (int i = 0; i <numberOfLines ; i++) {
            String[] inputArgs = reader.readLine().split("\\s+");
            String name = inputArgs[0];
            int age = Integer.valueOf(inputArgs[1]);
            Buyer buyer=null;
            switch (inputArgs.length){
                case 3:
                    String group = inputArgs[2];
                    buyer = new Rebel(name,age,group);
                    persons.putIfAbsent(name,buyer);
                    break;
                case 4:
                    String id = inputArgs[2];
                    String birthdate = inputArgs[3];
                    buyer = new Citizen(name,age,id,birthdate);
                    persons.putIfAbsent(name,buyer);
                    break;
            }
        }
        String name;
        while (!"End".equals(name=reader.readLine())){
            if (persons.containsKey(name)){
                persons.get(name).buyFood();
            }
        }
        System.out.println(persons.values().stream().mapToInt(Buyer::getFood).sum());

    }
}
