package java_test;

public class Exercise_3 {
    public static void check_prime() {
        double random = Math.random();
        int official_random_number = (int) (random * 1099);
        System.out.println("Random number: " + official_random_number);
        if (official_random_number < 2) {
            System.out.println(official_random_number + " isn't a prime number");
        } else {
            for (int i = 2; i <= official_random_number; i++) {
                if (official_random_number % i == 0) {
                    System.out.println(official_random_number + " isn't a prime number");
                    break;
                } else {
                    System.out.println(official_random_number + " is a prime number");
                    break;
                }
            }
        }
        }
    }

