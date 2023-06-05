import java.util.*;

public class createObj {

    public static int product(int num1, int num2) {
        return num1 * num2;

    }

    public static void main(String args[]) {
        createObj multi = new createObj();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(multi.product(a, b));

    }
}