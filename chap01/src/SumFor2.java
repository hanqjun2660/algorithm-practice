import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값 : " );
            n = sc.nextInt();
        } while (n <= 0);       // n이 0보다 클때까지 do 문이 반복된다. (음수나 0이 들어오면 계속 다시 입력)

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1부터 " + n + " 까지의 합은 " + sum + " 입니다.");
    }
}
