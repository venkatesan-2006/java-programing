import java.util.Scanner;
public class bg  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        int ld = a%10;
        if(ld % 3 == 0){
            System.err.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
