package runmain;

import java.util.Scanner;

public class RunMain {
    Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        person Sonnghien = new person();
        person tuduebe = new person();
        Sonnghien.setName("Son");
        Sonnghien.setAge(20);
        Sonnghien.setHobby("ăn");
        Sonnghien.setSex("nam");
        tuduebe.setName("tu");
        tuduebe.setAge(21);
        tuduebe.setHobby("ăn kem");
        tuduebe.setSex("nam");
        System.out.println("Sonnghien------->");
        Sonnghien.xuat();
        System.out.println("Tubuede--------->");
        tuduebe.xuat();
    }
    
}
