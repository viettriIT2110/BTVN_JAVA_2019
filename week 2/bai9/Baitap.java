package baitap;
//Giải phương trình bậc nhất: ax + b = 0.
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.max;
//import static jdk.nashorn.internal.objects.NativeMath.min;

public class Baitap {
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("nhap a : ");
        float a = cin.nextFloat();
        System.out.print("nhap b :  ");
        float b = cin.nextFloat();
        if (a == 0 ){
            System.out.println("Vô nghiệm");
        }
        else
            System.out.println("nghiem của hệ là :" + -b/a);
    
    }
}
