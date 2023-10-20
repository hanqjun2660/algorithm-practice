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
            if(!flag[j]) {
                pos[i] = j;
                if(i == 7) {
                    print();
                } else {
                    flag[j] = true;
                    set(i + 1);
                    flag[j] = false;
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
