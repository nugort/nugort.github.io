package Home_Work;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_2 {
    public static void another_array() {
        Scanner scanner = new Scanner(System.in);
        int n;

        outer_loop:
        for (;;) {
            do {
                System.out.println("Number of array's element");
                n = scanner.nextInt();
            } while (n < 1);
            int[] array = new int[n];

            if (n > 1) {
                System.out.println("Array's elements");
            } else {
                System.out.println("Array's element");
            }
            for (int i = 1; i < n + 1; i++) {
                System.out.print("Element number " + i + ": ");
                array[i - 1] = scanner.nextInt();
            }

            System.out.println("Your ogirinal array");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }

            System.out.println();

            //Chỗ này là "tăng lên 1 đơn vị vào số chẵn" chứ không phải "tăng lên 1 phần từ vào số chẵn" như chị giáo nói đâu nhó 😆
            System.out.println("After extra 1 to even number(s), your array here");
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    array[i] = array[i] + 1;
                }
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.println("\nOnce again my friend ?");
            int select;
            do {
                System.out.println("1 to continue");
                System.out.println("2 to end");
                select = scanner.nextInt();
            } while (select < 1 || select > 2);
            switch (select){
                case 1:
                    Exercise_2.another_array();
                case 2:
                    break outer_loop;
            }
        }

    }
}
