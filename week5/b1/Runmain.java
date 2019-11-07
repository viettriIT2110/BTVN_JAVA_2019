package runmain;

import java.util.Scanner;

public class Runmain {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        club hit = new club();
        hit.nhap();
        System.out.println("->>>>>>>>>>>>>");
        hit.xuat();
    }
    
}
