import java.util.Scanner;

public class LastNElements {
    /**
     * 링 버퍼를 이용하여 원하는 갯수만큼 값을 계속 입력받고
     * 요솟수가 N인 배열애 마지막 10개를 저장하자 (오래된 데이터를 버리는 용도로 사용)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N];
        int cnt = 0;            // 입력 받은 갯수
        int retry;

        System.out.println("정수를 입력하세요.");

        do {
            System.out.printf("%d번째 정수 : ", cnt + 1);
            a[cnt++ % N] = sc.nextInt();

            System.out.print("계속 입력할까요? (1.예 / 2.아니오)");
            retry = sc.nextInt();
        } while(retry == 1);

        int i = cnt - N;
        if(i < 0) {
            i = 0;
        }

        for(; i < cnt; i++) {
            System.out.printf("%2d번째 정수 = %d\n", i + 1, a[i % N]);
        }
    }
}
