import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Age : ");
        int a = sc.nextInt();

        if (a<18) {
            System.out.println("You Are NABALIK/MINOR");

        }

        else if(a>18){
            System.out.println("You are YOUNG Now");
        }

        else if(a>30){
            System.out.println("You Are Young");
        }

        else{
            System.out.println("You Are OLD & old is Gold");
            
            
        }
    } 
}
