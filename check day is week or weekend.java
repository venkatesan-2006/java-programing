import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the day: ");
     int day = sc.nextInt();
     switch(day){
         case 1,2,3,4,5 : 
             System.out.println(day + " is a weekday.");break;
         case 6,7 :
             System.out.println(day + " is weekend.");break;
         default : 
         System.out.println("no day");
     }
 }
}
