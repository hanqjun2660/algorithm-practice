import java.util.Scanner;

public class HanoiN {
    /**
     * move 메서드를 비재귀적으로 구현해보자
     */

    /**
     *
     * @param no 움직일 원반의 갯수
     * @param x  시작 기둥
     * @param y  목표 기둥
     */
    static void move(int no, int x, int y) {
        int[] xstk = new int[100];
        int[] ystk = new int[100];
        int[] sstk = new int[100];      // 스택
        int ptr = 0;        // 스택 포인터
        int sw = 0;         // 현재 상태

        while(true) {
            if(sw == 0 && no > 1) {
                xstk[ptr] = x;      // x의 값을 푸시
                ystk[ptr] = y;      // y의 값을 푸시
                sstk[ptr] = sw;     // sw의 값을 푸시
                ptr++;
                no = no - 1;
                y = 6 - x - y;
                continue;
            }

            System.out.printf("원반[%d]을 %d 기둥에서 %d 기둥으로 이동\n", no, x, y);

            if(sw == 1 && no > 1) {
                xstk[ptr] = x;
                ystk[ptr] = y;
                sstk[ptr] = sw;
                ptr++;
                no = no - 1;
                x = 6 - x - y;
                if (++sw == 2) {
                    sw = 0;
                }
                continue;
            }
            do{
                if(ptr-- == 0) {        // 스택이 비어 있으면
                    return;
                }
                x = xstk[ptr];          // 값을 저장하고 있는 x를 팝
                y = ystk[ptr];          // 값을 저장하고 있는 y를 팝
                sw = sstk[ptr] + 1;     // 값을 저장하고 있는 sw를 팝
                no++;
            } while (sw == 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수:");
        int n = sc.nextInt();

        move(n, 1, 3);      // 1기둥에 쌓인 n 개의 원반을 3기둥으로 이동
    }
}
