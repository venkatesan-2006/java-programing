import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value:");
        int a = sc.nextInt();
        System.out.println("Enter B value:");
        int b = sc.nextInt();
        int pro = a*b;
        System.out.println("pro of " + a + " * " + b + " is = " + pro);
        sc.close();
        
    }
}

