public class Rectangle {

    // Member variables
    double width;
    double height;

    // Enum for color
    enum Color {
        RED, GREEN, BLUE
    }

    // Member variable of enum type
    Color boxColor;

    public static void main(String[] args) {
        // Print the enum value
        System.out.println(Color.BLUE);
    }
}
