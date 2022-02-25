package java_test;

public class Exercise_4 {
    public static void list_prime_number() {
        int n = 10;
        int status = 1;
        int num = 2;

        System.out.println("First 10 prime number");

        for (int i = 2 ; i <= n;) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.print(num + " ");
                i++;
            }
            status = 1;
            num++;
        }
    }
}
