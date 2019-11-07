package test;

import java.util.Scanner;
public class Human {
    Scanner cin = new Scanner(System.in);
    private String name;
    private int HP;
    private int dmg;
    public void nhap(){
        System.out.print("Nhập tên: ");
        name = cin.nextLine();
        System.out.print("Nhập HP: ");
        HP = cin.nextInt();
        System.out.print("Nhập dmg: ");
        dmg = cin.nextInt();
    }
    public void Attack(Human human){
        this.HP = this.HP - human.getDmg();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    public String xuatnguoi() {
        return "Human : " + "name=" + name + ", HP=" + HP + ", dmg=" + dmg ;
    }
}
