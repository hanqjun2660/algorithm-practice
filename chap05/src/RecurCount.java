import java.util.Scanner;

public class RecurCount {
    /**
     * 재귀에 대한 이해를 높이기 위한 재귀 메서드(호출한 회수를 카운트)
     */
    static int count;

    static void recur(int n) {
        count++;
        if(n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();

        recur(x);

        System.out.println("메서드를 호출한 횟수 : " + count);
    }
}
