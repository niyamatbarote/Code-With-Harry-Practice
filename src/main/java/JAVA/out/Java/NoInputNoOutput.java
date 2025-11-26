public class NoInputNoOutput {

    void add() {
        int a = 10, b = 20;
        int sum = a + b;
        System.out.println("Sum (No input, No output): " + sum);
    }

    public static void main(String[] args) {
        NoInputNoOutput obj = new NoInputNoOutput();
        obj.add();
    }
}
