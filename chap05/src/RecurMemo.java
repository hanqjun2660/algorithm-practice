import java.util.Scanner;

public class RecurMemo {
    /**
     * 메모화(Memoization)를 사용하여 recur 메소드를 구현해보자
     * 메모화 기법을 사용하면 동일한 계산을 반복하지 않고 1회만 수행할 수 있다.
     */

    static String[] memo;

    static void recur(int n) {
        if(memo[n + 1] != null) {
            System.out.print(memo[n + 1]);      // 메모 출력
        } else {
            if(n > 0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
            } else {
                memo[n + 1] = "";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        memo = new String[x + 2];
        recur(x);
    }
}
