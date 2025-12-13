import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the day: ");
     int month = sc.nextInt();
     switch(month){
         case 12,1,2 : 
             System.out.println(month + " is a winter season.");break;
         case 3,4,5 :
             System.out.println(month + " is summer season.");break;
         case 6,7,8,9:
             System.out.println(month + " is monsoon season.");break;
         case 10,11 :
             System.out.println(month + " is autumn season.");break;
         default :
         System.out.println("you entered a wrong input.");

     }
     }
 }
