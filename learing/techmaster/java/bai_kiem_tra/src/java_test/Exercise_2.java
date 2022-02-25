package java_test;

public class Exercise_2 {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static void count_words(){
        String default_str = "You only live once, but if you do it right, once is enough";
        System.out.println("Default string: " + default_str);
        char hl = 'o';
        int count_hl = 0;
        int count = 0;
        int size = default_str.length();
        boolean not_counted = true;
        for (int i = 0; i < size; i++) {
            if (default_str.charAt(i) != SPACE && default_str.charAt(i) != TAB
                    && default_str.charAt(i) != BREAK_LINE) {
                if(not_counted) {
                    count++;
                    not_counted = false;
                }
            } else {
                not_counted = true;
            }
        }

        for (int i = 0; i < default_str.length(); i++) {
            if (default_str.charAt(i) == hl) {
                count_hl++;
            }
        }

        System.out.println("Word count of string: " + count);
        System.out.println("Number of occurrences of \"" + hl + "\" :" + count_hl);
        System.out.println("Position of \"o\" in the string");

        for (int i = 0; i < default_str.length(); i++) {
            if (default_str.charAt(i) == hl) {
                System.out.print(i + " ");
            }
        }
    }
}


