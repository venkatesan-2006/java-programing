import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value:");
        int a = sc.nextInt();
        System.out.println("Enter B value:");
        int b = sc.nextInt();
        int sum = a+b;
        int dif = a-b;
        int pro = a*b;
        int quotient = a/b;
        int remainder = a%b;
        System.out.println("Sum of " + a + " + " + b + " is = " + sum);
        System.out.println("Difference of " + a + " - " + b + " is = " + dif);
        System.out.println("Product of " + a + " * " + b + " is = " + pro);
        System.out.println("Quotient of " + a + " / " + b + " is = " + quotient);
        System.out.println("Remainder of " + a + " % " + b + " is = " + remainder);
        sc.close();

        
    }
}
