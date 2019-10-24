
package runmain;

import java.util.Scanner;

public class Dog {
    Scanner cin = new Scanner(System.in);
    private String name ;
    private int MP=100 ;
    public void InputName(){
        this.name = cin.nextLine();
       // System.out.println(name);
    }
    public void ShowMP(){
        System.out.println("MP hiện tại : " + MP);
    }
    public void Bark(){
        if(!name.equals("")){
            System.out.println(name + "sủa gâu gâu");
            MP = MP - 20;
        } else {
            System.out.println("Xin lỗi bạn chưa điền tên");
        }
    }
}
