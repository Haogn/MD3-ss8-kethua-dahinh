package ra;

public class Circle extends Shape{
    private double radius ;
    private final double PI = 3.14 ;

    public Circle(double radius) {
        this.radius = radius ;
    }
    public Circle(int soCanh, double chuVi , double dienTich, double radius) {
        super(soCanh,chuVi,dienTich);
        this.radius = radius ;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public void tinhChuVi() {
        this.setChuVi(2*PI*radius);
    }

    @Override
    public void tinhDienTich() {
        this.setDienTich(PI*radius*radius);
    }
}
