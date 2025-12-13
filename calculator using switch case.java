import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first number: ");
     double num1 = sc.nextDouble();
     System.out.println("Enter second number: ");
     double num2 = sc.nextDouble();
     System.out.println("Enter the operator: ");
     char opr = sc.next().charAt(0);
     double op = 0;
     switch(opr){
         case '+' : 
             System.out.println(num1 + " + " + num2 + "= " + (num1+num2));break;
         case '-' :
             System.out.println(num1 + " - " + num2 + "= " + (num1-num2));break;
         case '*' :
             System.out.println(num1 + " * " + num2 + "= " + (num1*num2));break;
         case '/' :
             System.out.println(num1 + " / " + num2 + "= " + (num1/num2));break;
         case '%' :
             System.out.println(num1 + " % " + num2 + "= " + (num1%num2));break;
         default :
             System.out.println("You entered a wrong inputs");
     }
     }
 }
