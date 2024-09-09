package bt5;

public class Run {
    public static void main(String[] args) {
        ArrayCalculator calc = new ArrayCalculator();
        int[] intArray = {1, 2, 3};
        double[] doubleArray  = {2.3, 4.9, 5.0};

        //Nếu có biến static thì không cần thông qua đối tượng
        System.out.println("Số nguyên lớn nhất trong mảng là: " + ArrayCalculator.maxOfArray(intArray));
        System.out.println("Số nguyên nhỏ nhất trong mảng là: " + ArrayCalculator.minOfArray(intArray));
        System.out.println("Số thực lớn nhất trong mảng là: " + ArrayCalculator.maxOfArray(doubleArray));
        System.out.println("Số thực nhỏ nhất trong mảng là: " + ArrayCalculator.minOfArray(doubleArray));
    }
}
