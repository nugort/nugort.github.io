package functions;

public class Fizzbuzz {
    public static void fizzbuzz(){
        String fizz = "FIZZ";
        String buzz = "BUZZ";
        String fizzbuzz = "FIZZBUZZ";
        for (int i = 0; i <= 100; i++) {
            if (i%3 == 0){
                if (i%5 == 0) {
                    System.out.println(fizzbuzz);
                } else {
                    System.out.println(fizz);
                }
            } else if (i%5 == 0) {
                System.out.println(buzz);
            } else {
                System.out.println(i);
            }
        }
    }
}
