package Exercises;

import java.util.Scanner;

public class Exercise_3 {
    public static void f__king_random_number() {
        Scanner scanner = new Scanner(System.in);
        float random = (float) Math.random();
        int random_number = (int) (random * 1099);
        System.out.println("Input your any number");
        int input_number = scanner.nextInt();
        System.out.println("Random number: " + random_number);
        String another_compare = (random_number == input_number) ? "Numbers are equal" : "Numbers not equal";
        System.out.println(another_compare);
    }
}
