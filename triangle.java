import java.util.Scanner;
public class q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height:");
        int base = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("Enter a,b,c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int perimeter = a+b+c;
        double area = (0.5 * base * height);
        System.out.println("Area of triangle: " + area);
        System.out.println("Perimeter of triangle: " + perimeter);
    }
}
