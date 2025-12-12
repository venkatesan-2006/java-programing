import java.util.Scanner;
public class bg  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        int ld = a%10;
        if(ld % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.err.println("Odd");
        }
    }
}
