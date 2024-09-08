package ra.demo01;

public class Human {
    //Thuộc tính
    private String name;
    private boolean sex;

    public int age;

    public Human() {
    }

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    //Phương thức ăn
    public void eat(){
        System.out.println(this.name + " Tôi đang ăn");
    }
}
