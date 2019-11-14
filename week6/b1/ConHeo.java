
package test;

public class ConHeo {
    private String ten;
    private double canNang;
    private int tuoi;

    public ConHeo() {
    }

    public ConHeo(String ten, double canNang, int tuoi) {
        this.ten = ten;
        this.canNang = canNang;
        this.tuoi = tuoi;
    }
    
    public void ShowInfo(){
        System.out.println("Tên: " + ten);
        System.out.println("Cân nặng: " + canNang);
        System.out.println("Tuổi: " + tuoi);
    }
}
