import ra.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5) ;
        System.out.println("Hinh tron co so canh la " + circle.getSoCanh());
        // tinh chu vi va dien tich
        circle.tinhChuVi();
        circle.tinhDienTich();

        // in ra cac thuoc tinh chu vi va dien tich tinh toan
        System.out.println("Chu vi " + circle.getChuVi());
        System.out.println("Dien tich " + circle.getDienTich());
    }
}
