package ra.demo01;

public class Test {
    public static void main(String[] args) {
        //Tạo 1 đối tượng sinh viên
//        Student student = new Student();
//        student.age = 10;
//        student.eat();
        Student student = new Student("Mai", false, 19, "B011");

        student.eat();
        student.learn();
    }
}
