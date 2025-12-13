import java.util.Scanner;

public class bg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Last digit of the " + num + " is " + (num%10));
    }
}
