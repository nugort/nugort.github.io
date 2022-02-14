package Exercises;

import java.util.Scanner;

public class Four_dot_0_circus_menu {
    public static void chmua_hme_menu(){
        Scanner scanner = new Scanner(System.in);
        int select;
//        System.out.println("Exercise 1");
//        System.out.println("Exercise 2");
//        System.out.println("Exercise 3");
//        System.out.print("Your select: ");
//        int select = scanner.nextInt();
//        if (select == 1) {
//            Exercise_1.side_input();
//        } else if (select == 2){
//            Exercise_2.string_compare();
//        } else if (select == 3){
//            Exercise_3.f__king_random_number();
//        } else {
//            System.out.println("Alo ???");
//        }
        for ( ; ; ){
            System.out.println("\n");
            System.out.println("1: Hypotenuse length calc");
            System.out.println("2: Basic string manipulation");
            System.out.println("3: Basic random number manipulation");
            System.out.println("4: Quit");
            do {
                System.out.println("1 2 3 or quail 😢");
                System.out.print("Your select: ");
                select = scanner.nextInt();
            } while (select < 1 || select > 4);
            switch (select) {
                case 1:
                    Exercise_1.side_input();
                    break;
                case 2:
                    Exercise_2.string_compare();
                    break;
                case 3:
                    Exercise_3.f__king_random_number();
                    break;
                case 4:
                    System.out.println("Really ? You're chose quail. cya");
                    System.exit(0);
            }
        }
    }
}
