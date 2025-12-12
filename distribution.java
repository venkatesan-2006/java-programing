import java.util.Scanner;
public class Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total candies and people: ");
        int candies = sc.nextInt();
        int people = sc.nextInt();
        int each = candies / people;
        int remaining = candies % people;
        System.out.println("Each person gets: " + each);
        System.out.println("Remaining candies: " + remaining);
    }
}
