import java.util.Scanner;
public class bg  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter your Roll No: ");
        int rn = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Roll No: "+ rn + ". Name: " + name);
        sc.close();
    }
}
