package basic_geometries_bmi_calc;

public class circle {
    public static final float pi_number = 3.14f;

    public static float perimeter(float radius) {
        return 2 * pi_number * radius;
    }

    public static float acreage(float radius) {
        return pi_number * radius * radius;
    }
}
