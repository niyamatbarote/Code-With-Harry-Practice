
import java.util.Scanner;


public class IfElseSwitchTest{
    public static void main(String[] args){
        //Q) write a java program to find out whether a student is pass or fail: if it
        //requres total of 40% and atleast 33% in each subjext to pas
        //Assume 3 Subjects and Take marks as an I/P from the user
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the marks of Subject 1: ");
        // int Sub1 = sc.nextInt();
        
        // System.out.println("ENter the Marks of Subject 2: ");
        // int Sub2 = sc.nextInt();

        // System.out.println("Enter the Marks of Subject 3: ");
        // int Sub3 = sc.nextInt();
        // int sum = Sub3+ Sub2+ Sub1;
        // float total =(sum/300f)*100;
        // if (total>40 && Sub1 >= 33 && Sub2 >= 33 && Sub3 >= 33) {
        //     System.out.println("Congrats... You are Pass with having"+ total+"%");
        // }
        // else{
        //     System.out.println( "Unfortunately Your Percentags is: "+total+"% And You Are Failed..!!");
        // }

        // Q) Calculate income tax for paid by an employee to the Govt. 
        // as per the slots mentioned below:
        // Income Slot   Tax
        // 2.5L - 5.0L   5%
        // 5.0L - 10.0L  20%
        // Above 10.0L   30%

        // System.out.println("ENter Your Income: ");
        // float a = sc.nextInt();
        // float tax5 = a*(5/100.0f);
        // float tax20 = a*(20/100.0f);
        // float tax30 = a*(30/100.0f);

        // if (a>=250000 && a<=500000) {
        //     System.out.println("Your Income Tax Will be 5%\n"+tax5+" Is  the Amout You need TO pay as Income Tax");
        // }
        // else if (a>500000 && a<=1000000) {
        //     System.out.println("Your Income Tax will be 20%\n"+tax20+" is the amoOUNT OF THE TAX YOU NEED TO PAY");
            
        // }
        // else if (a>1000000) {
        //     System.out.println("Your INcome Tax Will be 30%\n"+tax30+" IS THE AMOUNT OF TAX YOU NEED TO PAY");
        // }

        // Q) write a program to find out the of the week given the number [1 for Monday, 2 for Tuesday, so on]

        // System.out.println("enter Your Choice: ");
        // int day = sc.nextInt();

        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        // }

        // Q) Write a program to find if it is the leap year or not

        // System.out.println("Enter The Year: ");
        // int year = sc.nextInt();

        // if (year%4 == 0 && year%100 == 0 && year%400 == 0) {
        //     System.out.println("Its a Leap Year");
        // }
        // else{
        //     System.out.println("It is NOt Leap year");
        // }

        // Q) write a program to find out the type of website
        //  .com = commercial website
        //  .in = Indian website
        //  .org = Organizational Website

        System.out.println("ENter The Name of YOur Website: ");
        String str =sc.next();

        if (str.endsWith(".com")) {
            System.out.println("It is a Commercial Website");
        }
        else if(str.endsWith(".in")){
            System.out.println("It is an Indian Website");
        }
        else if(str.endsWith(".orf")){
            System.out.println("It is an Organizational Website");
        }

    }
}