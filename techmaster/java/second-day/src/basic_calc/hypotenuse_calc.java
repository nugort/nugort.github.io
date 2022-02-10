package basic_calc;

public class hypotenuse_calc {
    public static float hypotenuse(float side_a, float side_b) {
        float hypotenuse = (float) Math.sqrt(side_a * side_a + side_b *side_b);
        return hypotenuse;
    }
}
