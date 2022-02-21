package functions;

import java.util.Scanner;

public class BMI_calc {
    public static float calc(float weigh, float height){
        float BMI_value = weigh / (height * height);
        return BMI_value;
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your weigh");
        float weigh = scanner.nextFloat();
        System.out.println("Input your height");
        float height = scanner.nextFloat();
        System.out.printf("Your BMI value: %f", BMI_calc.calc(weigh, height));
        if (BMI_calc.calc(weigh, height) < 18.5) {
            System.out.println("You're underweight !");
        } else if (BMI_calc.calc(weigh, height) >= 18.5 && BMI_calc.calc(weigh, height) < 24.9) {
            System.out.println("You're normal");
        } else if (BMI_calc.calc(weigh, height) >= 25 && BMI_calc.calc(weigh, height) < 29.9) {
            System.out.println("You're overweight");
        } else if (BMI_calc.calc(weigh, height) >= 30 && BMI_calc.calc(weigh, height) < 34.9) {
            System.out.println("You're obese");
        } else {
            System.out.println("You're extremely obese");
        }
    }
}
