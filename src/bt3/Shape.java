package bt3;

public class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Phương thức trả về màu sắc
    public String toString() {
        return "Màu sắc: " + this.color;
    }
}
