import java.util.Scanner;
public class bg  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value: ");
        int a = sc.nextInt();
        System.out.println("Enter B value: ");
        int b = sc.nextInt();
        int pro = a*b;
        System.out.println("Product is: " + pro);
        if(pro>0)System.out.println("Positive");
        else System.out.println("Negative");
        sc.close();
    }
    
}
