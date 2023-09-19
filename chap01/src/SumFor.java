import java.util.Scanner;

public class SumFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합계를 구합니다.");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1부터 " + n + " 까지의 합계는 " + sum + " 입니다.");
        System.out.println("가우스 덧셈을 이용하여 1부터 n까지의 합계를 구함 : " + gauss(n));
        System.out.println("입력받은 두개의 숫자 사이의 정수의 합을 구함 : " + sumof(10, 87));
    }

    static int gauss(int n) {

        // 반복문을 안돌리고 아래와 같이 가우스 덧셈을 하면 편하게 합계도 구할 수 있다.
        int result = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);

        return result;
    }

    static int sumof(int a, int b) {

        int min = Math.min(a,b);
        int max = Math.max(a,b);

        int sum  = 0;

        for(int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }
}
