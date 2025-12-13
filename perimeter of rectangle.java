import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and width:");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area = 2(length + width);
        System.out.println("Perimeter of rectangle is " + area);
    }
}
