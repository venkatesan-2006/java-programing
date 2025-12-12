import java.util.Scanner;
public class Cakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cakes per hour: ");
        int cakesPerHour = sc.nextInt();
        System.out.print("Total working hours: ");
        int Working_hours = sc.nextInt();
        int totalCakes = cakesPerHour * Working_hours;
        System.out.println("Total cakes made: " + totalCakes);
    }
}
