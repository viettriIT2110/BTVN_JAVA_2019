package runmain;

import java.util.Scanner;

public class Runmain {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Knight knight = new Knight();
        String ten;
        int mau, nangluong;
        System.out.print("Nhập tên: ");
        ten = cin.nextLine();
        System.out.print("Nhập máu: ");
        mau = cin.nextInt();
        System.out.print("Nhập năng lượng: ");
        nangluong = cin.nextInt();
        knight.setName(ten);
        knight.setHP(mau);
        knight.setMP(nangluong);
        int i=1;
        do{
            System.out.println("lan thu  " + i + " dung ki nang : ");
            knight.Heal();
            knight.thongso();
            i++;
            if(knight.getMP() < 50)
                System.out.println("Không đủ năng lượng cho lần tiếp theo dùng kĩ năng : ");
        }
        while(knight.getMP() >= 50);
    }
    
}
