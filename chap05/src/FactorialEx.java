import java.util.Scanner;

public class FactorialEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }

    static int factorial(int x) {
        int result = 0;
        for(int i = 0; i < x; i++) {
            result = i * x;
        }

        /*int result = 1;
        while(x > 1) {
            result *= x--;
        }*/
        return result;
    }
}
