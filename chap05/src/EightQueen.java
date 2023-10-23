public class EightQueen {
    /**
     * 8퀸 문제를 해결하기 위해선 퀸의 모든 방향(행, 열, 대각선) 방향으로
     * 겹치지 않게 퀸을 배치해야한다. 이제 모든 방향에 대해서도 한정하는 조작을 추가하여
     * 8퀸 문제를 해결해보자
     */

    static boolean[] flag_a = new boolean[8];     // 각 행에 퀸을 배치했는지 체크
    static boolean[] flag_b = new boolean[15];     // / 대각선 방향으로 퀸을 배치했는지 체크
    static boolean[] flag_c = new boolean[15];     // \ 대각선 방향으로 퀸을 배치했는지 체크
    static int[] pos = new int[8];                  // 각 열에 있는 퀸의 위치

    static void print() {
        for (int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.printf("%s", j == pos[i] ? "■" : "□");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * i열의 알맞은 위치에 퀸을 배치
     * @param i 열
     */
    static void set(int i) {
        for(int j = 0; j < 8; j++) {
            if(flag_a[j] == false &&            // j행에 아직 배치하지 않음
                flag_b[i + j] == false &&       // / 대각선에 아직 배치하지 않음
                flag_c[i - j + 7] == false) {            // \ 대각선에 아직 배치하지 않음

                pos[i] = j;                     // i열 j행에 퀸을 배치

                if(i == 7) {                    // i가 7이라는 것은 모든 퀸의 배치가 끝났다는 이야기
                    print();                    // 출력
                } else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
