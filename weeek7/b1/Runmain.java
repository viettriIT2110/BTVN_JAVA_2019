package javaapplication;

import java.util.Scanner;

/**
 *
 * @author NVT
 */
public class Runmain {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong ky su: ");
        int n = scanner.nextInt();
        KySu[]kysus = new KySu[n];
        System.out.println("--------------------Nhap ky su--------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ky su thu " + (i + 1) + ":");
            kysus[i] = new KySu();
            kysus[i].nhap();
        }
        System.out.println("--------------------Cac ky su--------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Ky su thu " + (i + 1) + ":");
            kysus[i].xuat();
        }
        int min = kysus[0].namTN;
        for (int i = 1; i < n; i++) {
            if (kysus[i].namTN < min) {
                min = kysus[i].namTN;
            }
        }
        System.out.println("--------------------Cac ky su tot nghiep gan nhat--------------------");
        for (KySu kysu : kysus) {
            if (kysu.namTN == min) {
                kysu.xuat();
            }
        }
    }
    
}
