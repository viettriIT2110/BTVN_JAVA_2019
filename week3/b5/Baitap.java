package baitap;

import java.math.BigInteger;
import java.util.Scanner;
public class Baitap {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger a = cin.nextBigInteger();
        BigInteger b = cin.nextBigInteger();
        System.out.println(a.add(b));
    }
}