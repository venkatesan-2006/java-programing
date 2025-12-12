import java.util.Scanner;
public class bg  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value: ");
        int a = sc.nextInt();
        System.out.println("Enter B value: ");
        int b = sc.nextInt();
        int ld1 = a%10;
        int ld2 = b%10;
        if(ld1 == ld2)System.out.println(a + " and " + b + " have the same last digit.");
        else System.out.println("it doesn't");
        sc.close();
    }
    
}
