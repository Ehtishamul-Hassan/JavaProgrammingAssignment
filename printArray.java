public class printArray {

    public static void Scan(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int numbers[] = { 7, 4, 54, 32, 12, 23, 19, 76 };
        Scan(numbers);

    }
}