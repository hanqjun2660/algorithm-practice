import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a값 : ");
        int a = sc.nextInt();

        int b;
        while (true) {
            System.out.print("b값 : ");
            b = sc.nextInt();
            if(b > a) break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        System.out.println("b - a = " + (b - a));
    }
}
