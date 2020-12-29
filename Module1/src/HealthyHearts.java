import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        int age;
        String stringAge;

        int maxHR;
        int lowTarget;
        int highTarget;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your age?");
        stringAge = userInput.nextLine();
        age = Integer.parseInt(stringAge);

        maxHR = 220 - age;
        lowTarget = (int)(Math.round(maxHR * .5));
        highTarget = (int)(Math.round(maxHR * .85));

        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute");
        System.out.println("Your target HR Zone is " + lowTarget + " - " + highTarget + " beats per minute");


    }
}

