import java.util.Scanner;

public class Alternative1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.print("숫자 n을 입력하시오 : ");
            n = sc.nextInt();
            System.out.println("0이상의 숫자를 입력하시오.");
        } while(n <= 0);

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {            // 짝수
                System.out.print("+");
            } else {                    // 홀수
                System.out.print("-");
            }
        }
    }
}
