import java.util.Scanner;
public class q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value:");
        int a = sc.nextInt();
        int r,q;
        q = a/10;
        r = q%10;
        System.out.println("Middle Digit is: " + r);


    }
}