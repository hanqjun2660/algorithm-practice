public class QueenBB {
    /**
     * QueenB 클래스에서 규칙을 하나 더 추가하여 작성해보자 (분기한정법)
     * 아래 코드와 같이 불필요한 분기를 없애 조합을 줄이는 방법을 분기한정법이라고 한다.
     *
     * 규칙 1: 같은 열에 퀸을 배치하지 않는다.
     * 규칙 2: 각 행에 퀸을 1개만 배치한다.
     */

    static boolean[] flag = new boolean[8];     // 같은 행에 퀸이 배치되는것을 방지하는 배열
    static int[] pos = new int[8];              // 각 열의 퀸의 위치

    static void set(int i) {
        for(int j = 0; j < 8; j++) {
            if(!flag[j]) {                      // 아직 행에 퀸이 배치가 안되어 있을때
                pos[i] = j;
                if(i == 7) {                    // i가 7이면 모든 퀸의 배치가 끝났으므로 출력
                    print();
                } else {
                    flag[j] = true;             // j행에 퀸 배치가 끝나면 true로 바꿈
                    set(i + 1);                 // set 메서드 재귀호출 -> 다음 행에 퀸을 배치
                    flag[j] = false;            // 재귀호출한 메서드 실행이 끝나면 퀸을 j행에서 제거하기 위해 flag에 false를 대입
                }
            }
        }
    }

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        set(0);
    }
}
