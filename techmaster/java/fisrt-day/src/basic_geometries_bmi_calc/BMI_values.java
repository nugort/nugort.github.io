package basic_geometries_bmi_calc;

public class BMI_values {
    public static double BMI_value_double(double weigh, double height) {
        double BMI_value = weigh / (height * height);
        return BMI_value;
    }
}
