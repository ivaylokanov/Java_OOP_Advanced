package pr04_telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputPhones = reader.readLine().split("\\s+");
        for (int i = 0; i < inputPhones.length ; i++) {
            Smartphone smartphone = new Smartphone(inputPhones[i]);
            System.out.println(smartphone.call());
        }
        String[] inputWeb = reader.readLine().split("\\s+");
        for (int i = 0; i < inputWeb.length ; i++) {
            Smartphone smartphone = new Smartphone(inputWeb[i]);
            System.out.println(smartphone.browse());
        }
    }
}
