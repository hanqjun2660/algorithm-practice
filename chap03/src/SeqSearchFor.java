import java.util.Scanner;

public class SeqSearchFor {

    /**
     * SeqSearch Class의 선형검색을 For문으로 구현해보자
     * @param x     검색 대상 배열
     * @param num   입력받은 요솟수 (배열의 길이와 동일함)
     * @param ky    검색 대상 배열에서 검색할 값
     * @return      실패 or 검색한 값에 대한 인덱스
     */
    static int seqSearch(int[] x, int num, int ky) {
        for(int i = 0; i < num; i++) {
            if(x[i] == ky) {            // 검색에 성공하였을때 해당 인덱스를 return하고 반복문을 빠져나옴
                return i;
            }
        }
        return -1;                      // 반복이 끝나고도 위 조건에 걸리지 않는다면 -1을 return하여 실패
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
