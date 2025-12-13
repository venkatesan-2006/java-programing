import java.util.Scanner;
public class q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        int Radius = sc.nextInt();
        double area = (3.14 * Radius * Radius);
        System.out.println("Area of circle is: "+ area);
    }
}

