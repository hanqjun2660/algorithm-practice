import java.util.Scanner;

public class DigitsNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("입력한 숫자의 자릿수를 출력합니다.");

        do {
            System.out.print("정수값: ");
            n = sc.nextInt();
        } while (n <= 0);

        int no = 0;
        while(n > 0) {
            n /= 10;
            no++;
        }

        System.out.println("그 수는 " + no + "자리입니다.");
    }
}
