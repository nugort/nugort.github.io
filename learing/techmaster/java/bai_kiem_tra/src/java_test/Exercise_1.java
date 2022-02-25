package java_test;

import java.util.Scanner;

public class Exercise_1 {
    public static void triangle(){
        Scanner scanner = new Scanner(System.in);
        int high;
        System.out.println("Triangle high: ");
        high = scanner.nextInt();
        for (int i = 1; i <= high; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
