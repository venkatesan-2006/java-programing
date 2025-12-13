import java.util.Scanner;
public class bg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fcharacter: ");
        char ch = sc.next().charAt(0);
        System.out.println("'"+ch+"'");
        sc.close();
    }
}
