package BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Identifiable> cityOfRobots = new ArrayList<>();
        List<Identifiable> cityOfCitizens = new ArrayList<>();

        String input;

        while (!"End".equals(input = reader.readLine())){

            String tokens[] = input.split(" ");
            if (tokens.length == 2){
                Robot robot = new Robot(tokens[1], tokens[0]);
                cityOfRobots.add(robot);
            }else {
                Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                cityOfRobots.add(citizen);
            }
        }
        String lastDigit = reader.readLine();
        printFakeIdInCity(cityOfCitizens,lastDigit);
    }

    private static void printFakeIdInCity(List<Identifiable> city, String lastDigit) {
        for (Identifiable element : city) {
            if (element.getId().endsWith(lastDigit)){
                System.out.println(element.getId());
            }
        }
    }
}
