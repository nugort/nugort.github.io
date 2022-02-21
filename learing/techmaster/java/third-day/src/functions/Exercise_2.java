package functions;

import java.util.Scanner;

public class Exercise_2 {
    public  static void palindrome_check(){
        String reverse_string = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string you want to check");
        String input_String = scanner.nextLine();
        int length = input_String.length();
        for (int i = length - 1; i >= 0; i--)
            reverse_string = reverse_string + input_String.charAt(i);
        if (input_String.equals(reverse_string))
            System.out.printf("%s is a palindrome", input_String);
        else
            System.out.printf("%s isn't a palindrome", input_String);
    }
}
