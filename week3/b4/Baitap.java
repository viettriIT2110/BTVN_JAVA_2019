package baitap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baitap {
//    Một chuỗi được gọi là thân thiện khi nó có hello trong chuỗi. Bạn được phép bỏ đi 1 kí tự bao nhiêu lần cũng được 
//    cho đến khi nào tìm thấy hoặc không tìm thấy chữ hello.
//    Hãy in ra Yes nếu có thể bỏ các kí tự và tìm được chữ hello trong chuỗi và No nếu ngược lại.
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println(cin.next().matches(".*h.*e.*l.*l.*o.*") ? "YES":"NO");
    }
}