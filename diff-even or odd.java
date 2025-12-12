import java.util.Scanner;
public class bg  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value: ");
        int a = sc.nextInt();
        System.out.println("Enter B value: ");
        int b = sc.nextInt();
        int diff = a-b;
        if(diff%2==0){
            System.out.println(diff + " is Even.");
        }
        else{
            System.out.println(diff + " is Odd.");
        }
        sc.close();
    }
}
