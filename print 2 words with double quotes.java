import java.util.Scanner;
public class bg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first character: ");
        String ch1 = sc.nextLine();
        System.out.println("Enter second character: ");
        String ch2 = sc.nextLine();
        System.out.println("\"" + ch1 + "\"\"" + ch2 + "\"");
        sc.close();
    }
}
