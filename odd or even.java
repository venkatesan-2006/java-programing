import java.util.Scanner;
public class bg  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value: ");
        int a = sc.nextInt();
        System.out.println("Enter B value: ");
        int b = sc.nextInt();
        if(a<b){
            System.out.println("A is Smaller.");
        }
        else if (b<a) {
            System.out.println("B is smaller.");
        }
        else
            System.out.println("Two numbers are Equal.");
        sc.close();
    }
}
