import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String[] args) {

        // SumVerbose1 class에서처럼 반복할때마다 조건문을 거치면 효율이 떨어진다.
        // 아래와 같이 작성하면 반복만 돌리면 된다.

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("정수를 입력하세요. : ");
            n = sc.nextInt();
        } while(n <= 0);

        int sum = 0;

        for(int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }

        System.out.print(n + " = " + (sum += n));
    }
}
