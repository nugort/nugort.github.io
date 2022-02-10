import basic_geometries_bmi_calc.BMI_values;
import basic_geometries_bmi_calc.circle;
import basic_geometries_bmi_calc.square;
import basic_geometries_bmi_calc.triangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose   your option");
        System.out.println("7: BMI value");
        System.out.println("0: Square basic calc");
        System.out.println("1: Triangle basic calc");
        System.out.println("3: Circle basic calc");

        int x = scan.nextInt();

        if (x == 7) {
            System.out.println("You're chose 7");
            System.out.println("Plz enter your weigh (kg)");
            double weigh = scan.nextDouble();
            System.out.println(" Plz enter your height (m)");
            double height = scan.nextDouble();
            System.out.println("Your BMI value is " + BMI_values.BMI_value_double(weigh, height));
            if (BMI_values.BMI_value_double(weigh, height) < 18.5) {
                System.out.println("You're underweight !");
            } else if (BMI_values.BMI_value_double(weigh, height) >= 18.5 || BMI_values.BMI_value_double(weigh, height) < 24.9) {
                System.out.println("You're normal");
            } else if (BMI_values.BMI_value_double(weigh, height) >= 25 || BMI_values.BMI_value_double(weigh, height) < 29.9) {
                System.out.println("You're overweight");
            } else if (BMI_values.BMI_value_double(weigh, height) >= 30 || BMI_values.BMI_value_double(weigh, height) < 34.9) {
                System.out.println("You're obese");
            } else {
                System.out.println("You're extremely obese");
            }
        } else if (x == 0) {
            System.out.println("You're chose 0, ");
            System.out.println("Plz enter square length side");
            float side_length = scan.nextFloat();
            System.out.println("Your square acreage is: " + square.acreage(side_length));
            System.out.println("Your square perimeter is: " + square.perimeter(side_length));
        } else if (x == 1) {
            System.out.println("You're chose 1");
            System.out.println("Plz enter triangle a-side length");
            float side_length_a = scan.nextFloat();
            System.out.println("Plz enter triangle b-side length");
            float side_length_b = scan.nextFloat();
            System.out.println("Plz enter triangle c-side length");
            float side_length_c = scan.nextFloat();
            System.out.println("Your triangle acreage is: " + triangle.acreage(side_length_a, side_length_b, side_length_c));
            System.out.println("Your triangle perimeter is: " + triangle.perimeter(side_length_a, side_length_b, side_length_c));
        } else if (x == 3) {
            System.out.println("You're chose 3");
            System.out.println("Plz enter circle radius");
            float radius = scan.nextFloat();
            System.out.println("Your circle acreage is: " + circle.acreage(radius));
            System.out.println("Your circle perimeter is: " + circle.perimeter(radius));

        } else {
            System.out.println("Rll! - Just 3.1.0.7 or exit, my friend 💔");
        }
    }
}
