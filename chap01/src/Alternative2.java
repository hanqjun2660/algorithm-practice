import java.util.Scanner;

public class Alternative2 {
    /*
        Alternative1 class처럼 반복문 내 if문을 사용하지 않고 아래와 같이 처리하여 효율을 높일 수 있다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("숫자를 입력하세요: ");
            n = sc.nextInt();
            System.out.println("0보다 큰 숫자를 입력하세요.");
        } while (n <= 0);

        for(int i = 0; i < n / 2; i++) {    // n/2 회만큼 반복
            System.out.print("+-");
        }

        if(n % 2 != 0) {                    // n을 나눈 나머지가 0(짝수가 아니면) +를 출력
            System.out.print("+");
        }
    }
}
