import java.util.Scanner;
public class bg  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        if(a % 3 == 0 || a % 7 == 0)System.out.println(a + " is divisible by 3 or 7.");
        else System.out.println(a + " is not divisible by 3 or 7.");
        sc.close();
    }
    
}
