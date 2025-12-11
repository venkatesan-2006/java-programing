import java.util.Scanner;
public class q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value:");
        int a = sc.nextInt();
        int b = (a & (a - 1)) == 0;


    }
}