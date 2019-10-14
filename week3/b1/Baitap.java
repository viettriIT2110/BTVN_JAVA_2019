package baitap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baitap {
    // Nhập n số nguyên. Tìm phần tử lớn thứ 3 (lớn gần nhất, chỉ nhỏ hơn 2 số) trong mảng.
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = cin.nextInt();
        int dem =0;
        Integer[] mang = new Integer[n];
        System.out.println("nhap mang n phân tử : ");
        for(int i=0; i<n ;i++) 
            mang[i] = cin.nextInt();
        Arrays.sort(mang, Collections.reverseOrder());
//        for(int i=0; i<n ;i++) 
//            System.out.println(mang[i]);
        
        for(int i=0; i < n ;i++){
            if(mang[i] != mang[i+1])
                dem++;
            if(dem == 2 ){
                System.out.println("dap an la :" + mang[i+1]);
                break;
            }
        }
    }
}
