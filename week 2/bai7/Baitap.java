package baitap;
//tim max 2 so nguyen
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.max;

public class Baitap {
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n1 = cin.nextInt();
        int m1 = cin.nextInt();
        System.out.println("Max = " + (max(n1 , m1)));
    }
    
}
