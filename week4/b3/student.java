package runmain;

import java.util.Scanner;

public class student {
    Scanner cin = new Scanner(System.in);
    private String name;
    private String code;
    private int age;
    public void InputInfo(){
        System.out.print("nhap ten : ");
        this.name = cin.nextLine();
        System.out.print("nhap masv : ");
        this.code = cin.nextLine();
        System.out.print("nhap age : ");
        this.age = cin.nextInt(); 
    }
    public void ShowInfo(){
        System.out.println("TEN : " + name + " , masv " + code + " , age " + age);
    }
}
