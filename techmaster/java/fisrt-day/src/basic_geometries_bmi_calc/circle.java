package basic_geometries_bmi_calc;

public class circle {
    public static final float PI_NUMBER = 3.14f;

    public static float perimeter(float radius) {
        float result = 2 * PI_NUMBER * radius;
        return result;
    }

    public static float acreage(float radius) {
        float result = PI_NUMBER * radius * radius;
        return result;
    }
}
