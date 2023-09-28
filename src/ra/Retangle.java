package ra;

public class Retangle extends  Shape{
    private double chieuDai ;
    private double chieuRong ;

    public Retangle(double chieuDai , double chieuRong) {
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai ;
    }


    @Override
    public void tinhChuVi() {
        this.setChuVi((chieuDai + chieuRong) * 2);
    }

    @Override
    public void tinhDienTich() {
        this.setDienTich(chieuDai * chieuRong);
    }
}
