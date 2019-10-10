package baitap;
//Nhập 1 số nguyên n từ bàn phím và hiển thị giá trị vừa nhập ra màn hình.

import java.util.Scanner;

public class Baitap {
    
    public static void main(String[] args) {
        System.out.println("Nhập Số Nguyên n :");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println("Số n = " + n);
    }
    
}
