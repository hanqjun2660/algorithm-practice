import java.util.Scanner;

public class PrintStars2 {

    /*
        PrintStars1 class에선 for문 내 if문이 존재하여 반복이 실행될때마다 조건을 거쳐야 하기 때문에, 효율이 떨어진다.
        아래와 같이 작성하면 반복이 끝난 후 나머지 처리를 하는 조건문 1회만 실행되기 때문에 효율이 좋다.
        repeat : 문자열을 반복한다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int w;

        do {
            System.out.print("별을 출력할 만큼 숫자를 입력하세요: ");
            n = sc.nextInt();
            System.out.println("0이상 숫자만 입력해주세요.");
        } while(n <= 0);

        do {
            System.out.print("별을 몇개 단위로 줄바꿈 할것인지 숫자를 입력하세요: ");
            w = sc.nextInt();
        } while(w <= 0 || w > n);

        for(int i = 0; i < n / w; i++) {            // n / w 만큼만 반복함 (n = 14; w = 5; 경우 별 다섯개짜리 두줄 출력 || n = 15; w = 5; 이면 별 다섯개짜리 세줄 출력)
            System.out.println("*".repeat(w));      // w만큼 문자열을 반복함
        }

        int rest = n % w;

        if(rest != 0) {     // n / w 후 남은 값이 있다면에 대한 처리
            System.out.println("*".repeat(rest));       // 나머지만큼 문자열을 반복하여 출력한다.
        }
    }
}
