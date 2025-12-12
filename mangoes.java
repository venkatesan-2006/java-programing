import java.util.Scanner;
public class MangoDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no mangoes: ");
        int n = sc.nextInt();
        System.out.print("Enter price per mango: ");
        int price = sc.nextInt();
        int free = n / 4;
        int pay = n - free;
        int amount = pay * price;
        System.out.println("Free mangoes: " + free);
        System.out.println("Total amount: " + amount);
    }
}
