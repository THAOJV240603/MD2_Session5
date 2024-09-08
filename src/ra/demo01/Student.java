package ra.demo01;

public class Student extends Human {
    private String studentCode;

    public Student() {
    }

    public Student(String name, boolean sex, int age, String studentCode) {
        super(name, sex, age);
        this.studentCode = studentCode;
    }

    //Phương thức learn
    public void learn(){
        //Gọi thuộc tính Name từ lớp cha Human
        System.out.println(super.getName() + " Mã SV " + this.studentCode + " đang học bài");
    }
}
