package functions;

import java.util.Scanner;

public class Quadratic_solve {

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It time to solve any quadratic: ax^2 + bx + c");
        System.out.println("a value");
        float a = scanner.nextFloat();
        System.out.println("b value");
        float b = scanner.nextFloat();
        System.out.println("c value");
        float c = scanner.nextFloat();
        float delta = (float) (Math.pow(b, 4) - 4 * a * c);
        if (delta == 0) {
//            System.out.println("x1 = x2 = %f", (-b/(2*a)));
            System.out.println();
        } else if (delta > 0) {
            System.out.println("");
        } else {
            System.out.println("");
        }
    }

}
