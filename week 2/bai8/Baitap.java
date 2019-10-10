package baitap;
//tim max 3 so nguyen
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.max;
//import static jdk.nashorn.internal.objects.NativeMath.min;

public class Baitap {
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        System.out.println("Max = " + max(max(a ,b),c) );
        System.out.println("Min = " + Math.min(Math.min(a ,b),c));
    }
    
}
