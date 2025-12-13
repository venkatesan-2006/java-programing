import java.util.Scanner;
public class bg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fraction number: ");
        double num = sc.nextDouble();
        System.out.printf("%.2f%n",num);
        sc.close();
    }
}

