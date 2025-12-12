import java.util.Scanner;
public class q23{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);  
         System.out.println("Enter Total Kilometer: "); 
         double km = sc.nextDouble();
         double meters = (km * 1000);
         System.out.println("Meters: " + meters);   
    }
} 
