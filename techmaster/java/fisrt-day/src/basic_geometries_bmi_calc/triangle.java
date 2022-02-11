package basic_geometries_bmi_calc;

public class triangle {
    public static float perimeter(float side_length_a, float side_length_b, float side_length_c) {
        float result = side_length_a + side_length_b + side_length_c;
        return result;
    }

    public static float acreage(float side_length_a, float side_length_b, float side_length_c) {
        float semi_perimeter = (side_length_a + side_length_b + side_length_c) / 2;
        float result = (float) Math.sqrt(semi_perimeter * (semi_perimeter - side_length_a) * (semi_perimeter - side_length_b) * (semi_perimeter - side_length_c));
        return result;
    }
}
