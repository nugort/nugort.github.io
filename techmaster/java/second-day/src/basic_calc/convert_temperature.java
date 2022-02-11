package basic_calc;

public class convert_temperature {
    public static float c_to_f(float c_temperature) {
        float result = (float) (c_temperature * 1.8 + 32);
        return result;
    }

    public static float f_to_c(float f_temperature) {
        float result = (float) ((f_temperature - 32) / 1.8);
        return result;
    }
}
