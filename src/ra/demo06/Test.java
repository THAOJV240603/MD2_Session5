package ra.demo06;

public class Test {
    public static void main(String[] args) {
        Human human = new Human();
        Human ngocMai = new Singer();
        Human sinhVien = new Student();

        human.sing();
        ngocMai.sing();
        sinhVien.sing();
    }
}
