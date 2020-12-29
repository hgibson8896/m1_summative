import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {

        String name;
        int sum;

        Scanner userDog = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        name = userDog.nextLine();
        System.out.println("Well then, I have this highly reliable report on Sir Fluffy McFlufferkins Esquire's prestigious background right here.\n");
        System.out.println(name + " is :\n");



        int[] dogs= new int[5];


        do {
            sum = 0;

            for (int i = 0; i < dogs.length ; i++) {
                Random randomizer = new Random();
                dogs[i] = randomizer.nextInt(101);
                sum += dogs[i];

            }
        }while(sum != 100);



        System.out.println(dogs[0] + "% St. Bernard");
        System.out.println(dogs[1] + "% Chihuahua");
        System.out.println(dogs[2] + "% Dramatic RedNosed Asian Pub");
        System.out.println(dogs[3] + "% Common Cur");
        System.out.println(dogs[4] + "% King Doberman\n");

        System.out.println("Wow, that's QUITE a dog!");

        }


    }

