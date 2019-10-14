package baitap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baitap {
    //Nhập vào một chuỗi bất kì, hiển thị ra tổng các số trong chuỗi.
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("nhap vao chuoi :");
        String s = cin.nextLine();
        int tong =0;
        for(int i =0; i <s.length();i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                tong+=(s.charAt(i)- 48);
        }
        System.out.println("tong cac chu so la :" + tong);
    }
}
