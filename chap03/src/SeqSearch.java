import java.util.Scanner;

public class SeqSearch {

    /**
     *
     * @param x     검색 대상 배열
     * @param num   입력받은 요솟수 (배열의 길이와 동일함)
     * @param ky    검색 대상 배열에서 검색할 값
     * @return      실패 or 검색한 값에 대한 인덱스
     */
    static int seqSearch(int[] x, int num, int ky) {
        int i = 0;

        while(true) {
            if(i == num) {      // 배열의 끝까지 순차검색 하였는데도 값이 없다면
                return -1;
            }
            if(x[i] == ky) {    // 순차검색이기 때문에 검색할 값과 배열 x[i]의 값이 같다면 i를 return한다. (i만 return해도 순차적으로 검색하며 증가하기 때문에 i를 return하면 배열의 어느 인덱스에 있는지 알 수 있다.)
                return i;
            }
            i++;                // 위 조건 2개 모두 해당되지 않으면 i를 1증가 시키고 다시 반복
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];     // 요솟수가 num인 배열을 생성

        for(int i = 0; i < num; i++) {          // 배열 x에 값을 입력
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");        // key값을 입력받음
        int ky = sc.nextInt();

        int idx = seqSearch(x, num, ky);        // 배열 x에서 값이 ky인 요소를 검색

        if(idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}
