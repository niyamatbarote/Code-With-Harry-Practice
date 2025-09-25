public class GradeEncrypt {
    public static void main(String[] args) {
        char grade = 'B';

        // ENcryption;
        // ❌ grade = grade + 8;
        grade = (char) (grade + 8);
        System.out.println("Encrypted Grade is: " + grade);

        // Decryption ;
        grade = (char) (grade - 8);
        System.out.println("Decrypted Grade is: " + grade);
    }
}
