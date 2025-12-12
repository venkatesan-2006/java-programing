import java.util.Scanner;
public class bg  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Tamil: ");
        int tamil = sc.nextInt();
        System.out.println("English: ");
        int english = sc.nextInt();
        System.out.println("Maths: ");
        int maths = sc.nextInt();
        System.out.println("Science: ");
        int science = sc.nextInt();
        System.out.println("Social: ");
        int social = sc.nextInt();
        System.out.println("Tamil: "+  tamil); 
        System.out.println("English: " + english);
        System.out.println("Maths: " + maths);
        System.out.println("Science: " + science);
        System.out.println("Social: " + social);
        sc.close();
    }
}
