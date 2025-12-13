import java.util.Scanner;
public class q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int perimeter = a+b+c;
        System.out.println("Perimeter of triangle: " + perimeter);
    }
}
