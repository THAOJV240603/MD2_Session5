package bt4;

public class Run{
    public static void main(String[] args) {
        ArrayCalculator calc = new ArrayCalculator();
        int[] intArray = {1, 2, 3};
        double[] doubleArray  = {2.3, 4.9, 5.0};

        //Nếu có biến static thì không cần thông qua đối tượng
        System.out.println("Tổng của mảng số nguyên là: " + ArrayCalculator.sumOfArray(intArray));
        System.out.println("Tổng của mảng số thực là: " + ArrayCalculator.sumOfArray(doubleArray));
    }
}
