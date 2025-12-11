import java.util.Scanner;
public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value:");
        int a = sc.nextInt();
        int sum=0,temp,temp1;
        temp=a%10;
        temp1=a/100;
        sum=temp+temp1;
        System.out.println("Sum : "+ sum);
    }
}