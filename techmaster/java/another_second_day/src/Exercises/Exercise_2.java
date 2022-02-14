package Exercises;

import java.util.Scanner;

public class Exercise_2 {
    public static void string_compare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput first string");
        String first_string = scanner.nextLine();
        System.out.println("Rest string");
        String rest_string = scanner.nextLine();

        //value comparing
        boolean value_compare = first_string.equals(rest_string);
        if (value_compare == true) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings not same");
        }

        //length comparing
        int first_string_length = first_string.length();
        int rest_string_length = rest_string.length();
        if (first_string_length > rest_string_length) {
            System.out.println("The first string is longer");
        } else {
            System.out.println("The first string is shorter");
        }

        //string on string ?
        boolean string_on_string = first_string.contains(rest_string);
        if (string_on_string == true) {
            System.out.println("The first contain the rest string");
        } else {
            System.out.println("The first doesn't contains the rest string");
        }
    }
}
