package ra.demo05;

public class Test {
    public static void main(String[] args) {
        Cal cal = new Cal();
        int total2 = cal.sum(10, 20);
        int total3 = cal.sum(15, 20, 25);
        String st = cal.sum("A", "B");
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(st);
    }
}
