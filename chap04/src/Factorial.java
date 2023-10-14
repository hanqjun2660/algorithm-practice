import java.util.Scanner;

public class Factorial {
    /**
     * 입력된 정수의 팩토리얼을 구하는 재귀 알고리즘 연습을 위한 클래스
     * 직접 재귀 : 자기 자신과 같은 메서드를 호출
     * 간접 재귀 : 다른 메서들르 통해 자기 자신과 같은 메서드를 호출
     */

    // 음이 아닌 정수 n의 팩토리얼 값을 반환
    static int factorial(int n) {
        if(n > 0) {                         // 입력받은 정수가 0보다 클때
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    /*public int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
