package On_Lab;

public class Array_test {

    public static int Min_Max() {
        int[] functions_options = new int[4];
        functions_options[0] = 3;
        functions_options[1] = 1;
        functions_options[2] = 0;
        functions_options[3] = 7;

        int length = functions_options.length;
        int min = functions_options[0];
        int max = functions_options[0];

        System.out.println("Default array !");
        for (int i = 0; i < functions_options.length; i++){
            System.out.print(functions_options[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < functions_options.length; i++){
            if (min > functions_options[i]){
                min = functions_options[i];
            }
        }
        System.out.println("Min: " + min);

        for (int i = 0; i < functions_options.length; i++){
             if (max < functions_options[i])
                 max = functions_options[i];
            }
        System.out.println("Max: " + max);

        return 0;
    }
}
