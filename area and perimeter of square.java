import java.util.Scanner;
public class q16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side:");
        int side = sc.nextInt();
        int area = (side * side);
        int perimeter = 4 * side;
        System.out.println("Area of Square is: " + area);
        System.out.println("perimeter of Square is: " + perimeter);
    }
}
