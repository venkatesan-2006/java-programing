import java.util.Scanner;
public class q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value:");
        int a = sc.nextInt();
        int b;
        b = Math.abs(a);
        System.out.println("Absolute value is: " + b);
    }
}