import java.util.Scanner;
public class dob  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("%02d/%02d/%2d" ,d,m,y);
    }
}
