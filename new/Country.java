import java.util.ArrayList;
import java.util.Scanner;

public class Country {

    public static void main(String[] args) {

        ArrayList<String> countryList = new ArrayList<String>();
        String input = "";

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Country Name:");
            input = in.nextLine();

            // for breaking out of loop
            if (input.equals("Exit")) {
                break;
            }
            countryList.add(input);
        }

        for (int i = 0; i < countryList.size(); i++) {
            System.out.println(countryList.get(i));
        }

    }
}