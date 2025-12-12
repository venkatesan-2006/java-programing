import java.util.Scanner;
public class q24{
    public static long convertBytesToBits(long bytes) {
        return bytes * 8;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        long bytes = sc.nextLong();
        long bits = convertBytesToBits(bytes);
        System.out.println(bits);
    }
} 
