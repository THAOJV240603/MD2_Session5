package ra.demo02;

public class Animal {
    private String type;
    private float weight;

    public Animal() {
    }

    public Animal(String type, float weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //Phương thức in thông tin
    public void displayData(){
        System.out.println("Loài động vật: " + this.type + "\n" + "Cân nặng: " + this.weight + " kg");
    }
}
