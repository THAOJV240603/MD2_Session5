package bt3;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài 3 cạnh: ");
        System.out.print("Cạnh 1: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Cạnh 2: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Cạnh 3: ");
        double c = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập màu sắc: ");
        String co = sc.nextLine();
        System.out.println("\n");

        //Tạo đối tượng Triangle
        Triangle triangle = new Triangle(a, b, c);
        Shape shape = new Shape(co);

        //In ra thông tin màu sắc, diện tích, chu vi của tam giác
        System.out.println("Thông tin của tam giác: ");
        System.out.println(triangle);
        System.out.println(shape);

        //Data: a=5 , b=4 , c=3
    }
}
