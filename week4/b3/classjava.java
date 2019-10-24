package runmain;

import java.util.Scanner;

public class classjava {
    Scanner cin = new Scanner(System.in);
    private student[] stdList;
    private int ratingStar;
    private String leader;
    private void InputStudent(){
        System.out.print("Nhập số sinh viên: ");
        int n = cin.nextInt();
        stdList = new student[n];
        for(int i = 0; i < n; i++){
            stdList[i] = new student();
            System.out.println("nhập sinh vien thứ " + (i+1) + " : ");
            stdList[i].InputInfo();
        }
    }
    private void ShowStudent(){
        for(int i=0;i<stdList.length;i++){
            System.out.println("sinh vien thứ " + (i+1) + " : ");
            stdList[i].ShowInfo();
        }
    }
     public void InputClassInfo(){
        System.out.print("Nhập tên leader: ");
        leader = cin.nextLine();
        System.out.print("Đánh giá chất lượng: ");
        ratingStar = cin.nextInt();
        InputStudent();
    }
            
    public void ShowClassInfo(){
        System.out.println("Leader: " + leader);
        System.out.println("Rating Star: " + ratingStar);
        ShowStudent();
    }
}
