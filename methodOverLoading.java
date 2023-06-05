import java.util.*;

public class methodOverLoading {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static void main(String args[]) {
        methodOverLoading method = new methodOverLoading();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(method.add(a, b));
        System.out.println(method.add(a, b, c));
        double sum = (method.add(a, b, c));
        System.out.println(sum);

    }
}