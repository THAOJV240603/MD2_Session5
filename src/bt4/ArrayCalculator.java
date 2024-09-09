package bt4;

public class ArrayCalculator {
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static double sumOfArray(double[] arr) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return sum;
    }
}
