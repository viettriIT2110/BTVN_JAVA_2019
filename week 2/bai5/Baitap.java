package baitap;
//Nhập 2 số nguyên n1, m1 ; 2 số thực n2, m2 từ bàn phím.
//Tính tổng của 2 số nguyên, tổng của 2 số thực, tính tổng của n1+n2 và hiển thị các kết quả ra màn hình.
import java.util.Scanner;

public class Baitap {
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n1 = cin.nextInt();
        int m1 = cin.nextInt();
        float n2 = cin.nextFloat();
        float m3 = cin.nextFloat();
        System.out.println("tong so nguyen : " + (n1 +m1));
        System.out.println("tong so float : " + (n2 +m3));
        System.out.println("tổng của n1+n2  : " + (n1 +n2));
    }
    
}
