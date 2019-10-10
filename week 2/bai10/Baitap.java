package baitap;
//Giải phương trình bậc 2: ax2 + bx +c = 0.
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
        System.out.print("nhap c :  ");
        float c = cin.nextFloat();
        if (a == 0 ){
            System.out.println("không phải phương trình bậc 2:");
        }
        else{
            float delta= (b*b)-(4*a*c),x1=0,x2=0;
            if(delta<0){
                System.out.println("Phương trình vô nghiệm");
            }
            if(delta==0){
                x1= -b/(2*a);
                System.out.println("Phương trình có nghiệm duy nhất" +x1);
            }
            if(delta>0){
                x1=(float) ((-b+Math.sqrt(delta))/(2*a));
                x2=(float) ((-b-Math.sqrt(delta))/(2*a));
                System.out.println("Phương trình có hai nghiệm" );
                System.out.println(x1);
                System.out.println(x2);
            }
        }
    
    }
}
