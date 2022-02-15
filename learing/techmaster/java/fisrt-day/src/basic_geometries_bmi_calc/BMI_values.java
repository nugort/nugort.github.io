package basic_geometries_bmi_calc;

public class BMI_values {
    public static double BMI_value_double(double weigh, double height) {
        double result = weigh / (height * height);
        return result;
    }
}
