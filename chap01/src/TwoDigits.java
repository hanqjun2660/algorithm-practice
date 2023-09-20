import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("2자리수 양수를 입력하세요 : ");
            n = sc.nextInt();
        } while(n < 10 || n > 99);

        System.out.println("변수 n의 값은 " + n + " 이 되었습니다.");
    }
}
