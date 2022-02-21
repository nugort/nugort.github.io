package functions;

public class Exercise_1 {
    public static void appearance_of_a(){
        String default_string = "Hello everyone";
        char character_e = 'e';
        int count = 0;
        for (int i = 0; i < default_string.length(); i++) {
            if (default_string.charAt(i) == character_e) {
                count++;
            }
        }
        System.out.println("Appearance of " + character_e +
                " in " + default_string + ": " + count);
        System.out.println();
    }
}
