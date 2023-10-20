public class QueenB {

    /**
     * 8퀸 문제로 재귀알고리즘을 연습하자
     * 모든 경우의 조합을 나열하는 프로그램을 작성(분기)
     * 아래 코드의 경우는 모든 경우의 배치를 나열하기때문에 8퀸 문제를 해결하지 못한다.
     */

    static int[] pos = new int[8];      // 각 열의 퀸의 위치를 기록한 배열

    static void print() {
        for(int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    /**
     *
     * @param i -> 열
     */
    static void set(int i) {
        for(int j = 0; j < 8; j++) {        // j는 행
            pos[i] = j;     // 퀸을 j행에 배치
            if(i == 7) {    // 모든 퀸의 배치가 끝나면 배열 출력
                print();
            } else {
                set(i + 1);     // i + 1을 매개변수로 넘기면서 재귀호출 하여 다음열에 대한 퀸의 배치를 진행.
            }
        }
    }

    public static void main(String[] args) {
        set(0);     // 0열에 퀸 배치
    }
}
