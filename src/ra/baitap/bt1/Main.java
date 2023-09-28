package ra.baitap.bt1;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Hoang");
        System.out.print("Original value:");
        System.out.println(myClass.getMyString());
        myClass.setMyString("Haogn");
        System.out.print("New value: ");
        System.out.println(myClass.getMyString());
    }
}
