public class sumOfArray {

    public static int sum(int numbers[]) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;

    }

    public static void main(String args[]) {
        int numbers[] = { 3, 5, 8, 12, 10, 15, 1 };
        System.out.println("Sum of the array is " + sum(numbers));

    }
}