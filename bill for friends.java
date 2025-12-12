import java.util.Scanner;

public class q22{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);  
         System.out.println("Enter bill amount and no fo friends: "); 
         double bill = sc.nextDouble();
         double nof = sc.nextDouble();
         double split = bill/nof;
         System.out.println("Bill  fro Every person: RS." + split);
    }
} 
