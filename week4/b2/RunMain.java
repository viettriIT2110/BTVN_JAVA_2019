package runmain;

import java.util.Scanner;

public class RunMain {
    Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        Dog meo = new Dog();
        System.out.println("nhap ten : ");
        meo.InputName();
        int a = 3;
        while(a>0){
            meo.Bark();
            meo.ShowMP();
            a--;
        }
    }
    
}
