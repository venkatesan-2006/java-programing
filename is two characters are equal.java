import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first character: ");
     char ch = sc.next().charAt(0);
     System.out.println("Enter second character: ");
     char ch1 = sc.next().charAt(0);
     if(ch == ch1)System.out.println(ch + " and " + ch1 + " is are equal characters.");
     else System.out.println(ch + " and " + ch1 + " is not equal characters.");
     }
 }
