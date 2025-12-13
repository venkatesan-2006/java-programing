import java.util.Scanner;

public class bg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("All digit except the last digit of " + num + " is " + (num/10));
    }
}
