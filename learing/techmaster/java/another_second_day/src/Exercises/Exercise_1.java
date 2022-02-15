package Exercises;

import java.util.Scanner;

public class Exercise_1 {
    public static float hypotenuse_calc(float a_side, float b_side) {
        float result = (float) Math.sqrt(a_side * a_side + b_side * b_side);
        return result;
    }

    public static void side_input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a side length");
        float a_side = scanner.nextFloat();
        System.out.println("Input rest length");
        float b_side = scanner.nextFloat();
        System.out.printf("Hypotenuse length: %.2f", Exercise_1.hypotenuse_calc(a_side, b_side));
    }

    private float result;
}
