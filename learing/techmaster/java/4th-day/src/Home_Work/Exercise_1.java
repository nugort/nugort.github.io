package Home_Work;

import java.util.Scanner;

public class Exercise_1 {
    public static void display_name(){
        Scanner scanner = new Scanner(System.in);
        String name;

        outer_loop:
        for (;;) {
            System.out.println("Input your name: ");
            name = scanner.nextLine();
            char[] char_array = name.toCharArray();
            boolean found_space = true;
            for (int i = 0; i < char_array.length; i++) {
                if (Character.isLetter(char_array[i])){
                    if (found_space) {
                        char_array[i] = Character.toUpperCase(char_array[i]);
                        found_space = false;
                    }
                } else {
                    found_space = true;
                }
            }
            name = String.valueOf(char_array);
            System.out.println("Your name: " + name + "\n");
            System.out.println("Once again my friend 😢");
            int select;
            do {
                System.out.println("Select 1 to continue");
                System.out.println("Select 2 to end");
                select = scanner.nextInt();
            } while (select < 1 || select > 2);
            switch (select){
                case 1:
                    Exercise_1.display_name();
                case 2:
                    break outer_loop;
            }
        }

    }
}
