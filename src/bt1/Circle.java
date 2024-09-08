package bt1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Phương thức tính diện tích hình tròn
    public double getS(){
        return this.radius*this.radius*3.14;
    }

    //Phương thức tính chu vi hình tròn
    public double getCV(){
        return 2*3.14*this.radius;
    }

    //Phương thức in ra thông tin hình tròn
    public String toString(){
        System.out.println("Bán kính hình tròn: " + this.radius + " | " + " Màu sắc: " + this.color);
        System.out.println("Diện tích hình tròn: " + this.getS());
        System.out.println("Chu vi hình tròn: " + this.getCV());
        return null;
    }
}
