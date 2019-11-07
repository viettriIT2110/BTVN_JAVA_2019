package runmain;

import java.util.Scanner;

public class club {
    Scanner cin = new Scanner(System.in);
    private int n;
    private thanhvien thanhviens [];
    private String tenCLB = "HIT" ;
    public void nhap(){
        System.out.print("Nhập số lượng thành viên: ");
        n  = cin.nextInt();
        thanhviens = new thanhvien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thanh vien thu : " + (i+1));
            thanhviens[i] = new thanhvien();
            thanhviens[i].nhapmember();
        }
    }
    
    public void xuat(){
        System.out.println("Tên CLB: " + tenCLB);
        System.out.println("Số lượng thành viên: " + n);
        for(int i = 0; i < n; i++){
            System.out.println("Thanh vien thu : " + (i+1) );
            System.out.println(thanhviens[i].xuatmember());
        }
    }
    
}
