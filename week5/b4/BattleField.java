package test;

import java.util.Scanner;

public class BattleField {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Human[] humans = new Human[2];
        for (int i = 0; i < 2; i++) {
            humans[i] = new Human();
            System.out.println("Nhập người thứ " + (i + 1));
            humans[i].nhap();
        }
        System.out.println("---------Start---------");
        int i =1;
        while(humans[0].getHP() > 0 && humans[1].getHP() > 0 ){
            System.out.println("lượt " + i + " người 1 đánh người 2 ");
            humans[1].Attack(humans[0]);
            System.out.println(humans[0].xuatnguoi());
            System.out.println(humans[1].xuatnguoi());
            i++;
            System.out.println("lượt " + i + " người 2 đánh người 1 ");
            humans[0].Attack(humans[1]);
            System.out.println(humans[0].xuatnguoi());
            System.out.println(humans[1].xuatnguoi());
            i++;
        }
        System.out.println("Người dành chiến thắng: ");
        if (humans[0].getHP() > humans[1].getHP()) {
            System.out.println(humans[0].xuatnguoi());
        }
        if (humans[0].getHP() < humans[1].getHP()) {
            System.out.println(humans[1].xuatnguoi());
        }
        if (humans[0].getHP() == humans[1].getHP()) {
            System.out.println("Hòa");
        }
    }
    
}
