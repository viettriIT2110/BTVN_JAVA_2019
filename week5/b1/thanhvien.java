
package runmain;

import java.util.Scanner;

public class thanhvien {
    Scanner cin = new Scanner(System.in);
    private String maSV;
    private String ten;
    private int tuoi;
    private String lop;

    public void nhapmember(){
        System.out.print("Nhập mã sinh viên: ");
        maSV = cin.nextLine();
        System.out.print("Nhập tên: ");
        ten = cin.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = cin.nextInt();
        System.out.print("Nhập lớp: ");
        cin.nextLine();
        lop = cin.nextLine();
    }
    public String xuatmember() {
        return "MaSV=" + maSV + ", ten=" + ten + ", tuoi=" + tuoi + ", lop=" + lop ;
    }
}
