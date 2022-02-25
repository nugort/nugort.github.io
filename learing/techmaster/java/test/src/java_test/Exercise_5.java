package java_test;

import java.util.Scanner;

public class Exercise_5 {
    public static void two_d_array() {
        Scanner scanner = new Scanner(System.in);
        int row, column;

        System.out.println("Row(s) of array: ");
        row = scanner.nextInt();
        System.out.println("Column(s) of array: ");
        column = scanner.nextInt();

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Element no [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Your array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Elements of main diagonal");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
