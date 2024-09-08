package bt1;

public class Cylinder extends Circle{
    private double h;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double h) {
        super(radius, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    //Phương thức tính thể tích hình trụ
    public double getV(){
        return super.getS()*this.h;
    }

    //Phương thức in ra thông tin của hình trụ
    public String toString(){
        System.out.println("Bán kính hình trụ: " + super.getRadius());
        System.out.println("Chiều cao hình trụ: " + this.h);
        System.out.println("Thể tích hình trụ: " + this.getV());
        return null;
    }
}
