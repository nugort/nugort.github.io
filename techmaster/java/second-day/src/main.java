import basic_calc.basic_calculations;
import basic_calc.bmi_calc;
import basic_calc.convert_temperature;
import basic_calc.hypotenuse_calc;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int x, calc_functions, convert_functions;

        System.out.println("Select your option");
        System.out.println("3: BMI value ");
        System.out.println("1: Hypotenuse ");
        System.out.println("0: Basic calculations ");
        System.out.println("7: Convert temperature (Celsius to Fahrenheit, else) ");

        int x = scan.nextInt();
        if (x == 3) {
            System.out.println("BMI value again ? K, let's get it");
            System.out.println("Enter your height (m) ");
            float height = scan.nextFloat();
            System.out.println("Last step, enter your weight ");
            float weigh = scan.nextFloat();
            System.out.println("Is this what you expected ? " + bmi_calc.BMI_value(height, weigh));
        } else if (x == 1) {
            System.out.println("Yeh yeh, you're selected new option and I like it :3 ");
            System.out.println("Right now, enter any side length");
            float side_a = scan.nextFloat();
            System.out.println("and rest side length ");
            float side_b = scan.nextFloat();
            System.out.println("It's time to look at " + hypotenuse_calc.hypotenuse(side_a, side_b));
        } else if (x == 0) {
            System.out.println("Ez, select any function");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Power");

            int calc_functions = scan.nextInt();
            switch (calc_functions) {
                case 1:
                    System.out.println("Yes, it's addition");
                    System.out.print("Value: ");
                    double value_1 = scan.nextDouble();
                    System.out.print("Value, too: ");
                    double value_2 = scan.nextDouble();
                    System.out.println("Take result: " + basic_calculations.addition(value_1, value_2));
                    break;

                case 2:
                    System.out.println("K, let's sub");
                    System.out.print("Minuend: ");
                    double minuend = scan.nextDouble();
                    System.out.print("Subtrahend: ");
                    double subtrahend = scan.nextDouble();
                    System.out.println("Is it ? ... " + basic_calculations.subtraction(minuend, subtrahend));
                    break;

                case 3:
                    System.out.println("Let's try to multiplying");
                    System.out.print("Multiplicand: ");
                    double multiplicand = scan.nextDouble();
                    System.out.print("Multiplier: ");
                    double multiplier = scan.nextDouble();
                    System.out.println(basic_calculations.multiplication(multiplicand, multiplier) + "." + " Hmm, not bad");
                    break;

                case 4:
                    System.out.println("Welcome, division");
                    System.out.print("Dividend: ");
                    double dividend = scan.nextDouble();
                    System.out.print("Divisor: ");
                    double divisor = scan.nextDouble();
                    System.out.println(basic_calculations.division(dividend, divisor) + ", done");
                    break;

                case 5:
                    System.out.println("Thanks god, you're here");
                    System.out.print("Base: ");
                    double base = scan.nextDouble();
                    System.out.print("Exponent: ");
                    double exponent = scan.nextDouble();
                    System.out.println("Maybe ... " + basic_calculations.power(base, exponent) + " =)))");
                    break;
                default:
                    System.out.println("Option unavailable, bye");
            }
        } else if (x == 7) {
            System.out.println("That's right, this temperature conversion");
            System.out.println("1: Celsius to Fahrenheit");
            System.out.println("2: Fahrenheit to Celsius");

            int temp_functions = scan.nextInt();
            switch (temp_functions) {
                case 1:
                    System.out.println("Celsius to Fahrenheit");
                    System.out.print("Celsius: ");
                    float c_temperature = scan.nextFloat();
                    System.out.println("Fahrenheit: " + convert_temperature.c_to_f(c_temperature));
                    break;

                case 2:
                    System.out.println("Fahrenheit to Celsius");
                    System.out.print("Fahrenheit: ");
                    float f_temperature = scan.nextFloat();
                    System.out.println("Celsius: " + convert_temperature.f_to_c(f_temperature));
                    break;
                default:
                    System.out.println("Unavailable, reselect !");
            }
        } else {
            System.out.println("You're broke my heart ... cya");
        }
//        for (; ; ) {
//            System.out.println("Select your option");
//            System.out.println("1: BMI value ");
//            System.out.println("2: Hypotenuse ");
//            System.out.println("3: Basic calculations ");
//            System.out.println("4: Convert temperature (Celsius to Fahrenheit, else) ");
//
//            do {
//                System.out.println("Select your option");
//                x = scan.nextInt();
//            } while (x < 1 || x > 4);
//            switch (x) {
//                case 1:
//                    System.out.println("BMI value again ? K, let's get it");
//                    System.out.println("Enter your height (m) ");
//                    float height = scan.nextInt();
//                    System.out.println("Last step, enter your weight ");
//                    float weigh = scan.nextInt();
//                    System.out.println("Is this what you expected ? " + bmi_calc.BMI_value(height, weigh));
//                    break;
//                case 2:
//                    System.out.println("Yeh yeh, you're selected new option and I like it :3 ");
//                    System.out.println("Right now, enter any side length");
//                    float side_a = scan.nextInt();
//                    System.out.println("and rest side length ");
//                    float side_b = scan.nextInt();
//                    System.out.println("It's time to look at " + hypotenuse_calc.hypotenuse(side_a, side_b));
//                    break;
//                case 3:
//                    System.out.println("Basic, select any function");
//                    System.out.println("1: Addition");
//                    System.out.println("2: Subtraction");
//                    System.out.println("3: Multiplication");
//                    System.out.println("4: Division");
//                    System.out.println("5: Power");
//                    do {
//                        System.out.println("Select your option");
//                        calc_functions = scan.nextInt();
//                    } while (calc_functions < 1 || calc_functions > 5);
//                    switch (calc_functions) {
//                        case 1:
//                            System.out.println("Yes, it's addition");
//                            System.out.print("Value: ");
//                            double value_1 = scan.nextDouble();
//                            System.out.print("Value, too: ");
//                            double value_2 = scan.nextDouble();
//                            System.out.println("Take result: " + basic_calculations.addition(value_1, value_2));
//                            break;
//
//                        case 2:
//                            System.out.println("K, let's sub");
//                            System.out.print("Minuend: ");
//                            double minuend = scan.nextDouble();
//                            System.out.print("Subtrahend: ");
//                            double subtrahend = scan.nextDouble();
//                            System.out.println("Is it ? ... " + basic_calculations.subtraction(minuend, subtrahend));
//                            break;
//
//                        case 3:
//                            System.out.println("Let's try to multiplying");
//                            System.out.print("Multiplicand: ");
//                            double multiplicand = scan.nextDouble();
//                            System.out.print("Multiplier: ");
//                            double multiplier = scan.nextDouble();
//                            System.out.println(basic_calculations.multiplication(multiplicand, multiplier) + "." + " Hmm, not bad");
//                            break;
//
//                        case 4:
//                            System.out.println("Welcome, division");
//                            System.out.print("Dividend: ");
//                            double dividend = scan.nextDouble();
//                            System.out.print("Divisor");
//                            double divisor = scan.nextDouble();
//                            System.out.println(basic_calculations.division(dividend, divisor) + ", done");
//                            break;
//
//                        case 5:
//                            System.out.println("Thanks god, you're here");
//                            System.out.print("Base: ");
//                            double base = scan.nextDouble();
//                            System.out.print("Exponent: ");
//                            double exponent = scan.nextDouble();
//                            System.out.println("Maybe ... " + basic_calculations.power(base, exponent) + " =)))");
//                            break;
//                        default:
//                            System.out.println("Option unavailable, bye");
//                    }
//                case 4:
//                    System.out.println("That's right, this temperature conversion");
//                    System.out.println("1: Celsius to Fahrenheit");
//                    System.out.println("2: Fahrenheit to Celsius");
//
//                    do {
//                        System.out.println("Select your option");
//                        convert_functions = scan.nextInt();
//                    } while (convert_functions < 1 || convert_functions > 3);
//                    switch (convert_functions) {
//                        case 1:
//                            System.out.println("Celsius to Fahrenheit");
//                            System.out.print("Celsius: ");
//                            float c_temperature = scan.nextFloat();
//                            System.out.println("Fahrenheit: " + convert_temperature.c_to_f(c_temperature));
//                            break;
//
//                        case 2:
//                            System.out.println("Fahrenheit to Celsius");
//                            System.out.print("Fahrenheit: ");
//                            float f_temperature = scan.nextFloat();
//                            System.out.println("Celsius: " + convert_temperature.f_to_c(f_temperature));
//                            break;
//
//                        case 3:
//                            System.out.println("I'll your back");
//                            System.exit(0);
//                        default:
//                            System.out.println("Unavailable, reselect !");
//                    }
//                default:
//                    System.out.println("You're broke my heart ... cya");
//            }
//        }
    }
}