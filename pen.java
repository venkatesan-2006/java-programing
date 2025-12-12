import java.util.Scanner;
public class pens{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter no of pens: ");  
      int pens = sc.nextInt();
      System.out.println("Enter price of single pen: ");
      int price = sc.nextInt();
      int sets = pens / 5;
      int remaining = pens % 5;
      int payablePens = (sets * 3) + remaining;
      int amount = payablePens * price;
      System.out.println("Total amount need to pay: " + amount);
}
}
