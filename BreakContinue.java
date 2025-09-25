public class BreakContinue {
    public static void main(String[] args) {
        
        //BREAK ==================

        // for (int i = 0; i<=5; i++) {
        //     System.out.println(i);
        //     System.out.println("Java is Good");

        //     if (i==2) {
        //         System.out.println("If i == 2 Then loop will Exit Bcoz Break");
        //         break;

        //     }
        // }

        //CONTINUE ================
        //Note:- If You use CONTINUE Then it will print(Traverse) only till Continue and again the cursor will go to for Loop
        // Means The Cursor will Not Read the Information/Command After The CONTINUE Statement :-==

        for (int i = 0; i<=5; i++) {
            
            System.out.println(i);
            System.out.println("Hello");

            if (i==2) {
                System.out.println("Welcome");
                continue;
            }

            System.out.println("Kya Bolte");
        }
    }
    
}
