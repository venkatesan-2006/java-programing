import java.util.Scanner;

public class bg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your door no: ");
        int dn = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Street: ");
        String s = sc.nextLine();
        System.out.println("Enter your village: ");
        String v = sc.nextLine();
        System.out.println("Enter your district: ");
        String d = sc.nextLine();
        System.out.println(dn + "\n"+s+"\n"+v+"\n"+d);


    }
}
