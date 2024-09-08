package ra.demo02;

public class Dog extends Animal{
    private String color;
    private String name;

    public Dog() {
    }

    public Dog(String type, float weight, String color, String name) {
        super(type, weight);
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Phương thức sủa
    public void sua(){
        System.out.println("Tên: " + this.name + " | " + "Màu lông: " + this.color + " | " + "Loài: " + super.getType());
    }
}
