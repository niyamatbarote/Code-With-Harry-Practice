public class CwhFloat {

    public static void main(String[] args) {
        // THis is Wrong ❌ float a = 7 / 4 * 9 / 2;
        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println(a);

        // Another eg;
        int x = 7;
        int b = ((7 * 49) / (7 + 35)) / 7;
        System.out.println(b);

        int k = 0;
        float y = 9.991f;
        System.out.printf("the value of k is %d and value of y is %f", k, y);
        System.out.println(" ");
        System.out.printf("%d & %.3f", k, y);

    }
}