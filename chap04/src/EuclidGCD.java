import java.util.Scanner;

/**
 * 유클리드 호제법을 사용하여 두 정수의 최대공약수를 구해보자(재귀적으로)
 */
public class EuclidGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();
        System.out.print("정수를 입력하세요 : ");
        int y = sc.nextInt();

        System.out.println("최대공약수는 " + gcd(x, y) + " 입니다.");
    }

    static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}
