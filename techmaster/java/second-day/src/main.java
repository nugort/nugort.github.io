import basic_calc.bmi_calc;
import basic_calc.hypotenuse_calc;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose your option");
        System.out.println("1: BMI value");
        System.out.println("2: Hypotenuse ");

        int x = scan.nextInt();

        if (x == 1) {
            System.out.println("BMI value again ? K, let's get it ");
            System.out.println("Enter your height (m) ");
            float height = scan.nextInt();
            System.out.println("Last step, enter your weight ");
            float weigh = scan.nextInt();
            System.out.println("Is this what you expected ? " + bmi_calc.BMI_value(height, weigh));
        } else if (x == 2) {
            System.out.println("Yeh yeh, you're chose new option and I like it :3 ");
            System.out.println("Right now, enter a side length");
            float side_a = scan.nextInt();
            System.out.println("Next step, enter the rest of side ");
            float side_b = scan.nextInt();
            System.out.println("Done, just thanks to me and take it " + hypotenuse_calc.hypotenuse(side_a, side_b));
        } else {
            System.out.println("You're broke my heart ... cya");
        }
    }
}