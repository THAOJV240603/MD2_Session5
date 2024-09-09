package bt3;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    //Phương thức trả vể diện tích tam giác
    // Nửa ChuVi p=(a+b+c)/2;
    // ChuVi=p*2 ;
    // DienTich=Math.sqrt(p*(p-a)*(p-b)*(p-c));
    public double getArea(){
        double p = (this.side1+this.side2+this.side3)/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }

    //Phương thức trả về chu vi tam giác
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    //Phương thức trả về thông tin tam giác
    @Override
    public String toString(){
//        System.out.println("Cạnh 1: " + this.side1);
//        System.out.println("Cạnh 2: " + this.side2);
//        System.out.println("Cạnh 3: " + this.side3);
//        System.out.println("Diện tích: " + this.getArea());
//        System.out.println("Chu vi: " + this.getPerimeter());
        return "Cạnh 1: " + this.side1 + "\n" + "Cạnh 2: " + this.side2 + "\n" + "Cạnh 2: " + this.side3 + "\n"
                + "Diện tích: " + this.getArea() + "\n" + "Chu vi: " + this.getPerimeter();
    }
}
