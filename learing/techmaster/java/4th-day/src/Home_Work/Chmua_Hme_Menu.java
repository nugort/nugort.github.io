package Home_Work;

import java.util.Scanner;

public class Chmua_Hme_Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int select;

        outer_loop:
        for (;;) {
            System.out.println("What exercise do you want to test ?");
            do {
                System.out.println("1: Exercise 1");
                System.out.println("2: Exercise 2");
                System.out.println("3: Exit");
                select = scanner.nextInt();
            } while (select < 1 || select > 3);
            switch (select) {
                case 1:
                    Exercise_1.display_name();
                    break;
                case 2:
                    Exercise_2.another_array();
                    break;
                case 3:
                    System.out.println("Cya ...");
                    break outer_loop;
                    //System.exit(0);
            }

        }
    }
}
