import java.util.Scanner;
public class bg  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        if(a % 2 == 0 && a % 5 == 0){
            if(a % 8 != 0){
            System.out.println(a + " is divisible by both 2 and 5 but not 8.");
            }
        }
        else System.out.println(a + " is not divisible by both 2 and 5 but not 8.");
        sc.close();
    }
    
}
