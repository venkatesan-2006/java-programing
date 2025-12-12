import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price and discount % ");
        double price = sc.nextDouble();
        double discount = sc.nextDouble();
        double discountAmount = (price * discount) / 100;
        double finalPrice = price - discountAmount;
        System.out.println("Price After Discount : " + finalPrice);
    }
}
