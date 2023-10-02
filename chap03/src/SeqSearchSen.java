import java.util.Scanner;

public class SeqSearchSen {

    static int seqSearchSen(int[] x, int num, int ky) {
        int i = 0;

        x[num] = ky;                // 배열 마지막 인덱스에 추가한다.

        while(true) {
            if(x[i] == ky) {        // 보초법을 사용하면 종료 조건이 1개로 줄어든다.
                break;
            }
            i++;
        }
        return i == num ? -1 : i;   // i와 num이 같다면 -1(검색실패)로 처리한다. 하지만 배열 마지막 인덱스에는 해당 값이 존제한다.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num+1];       // 보초법으로 선형검색을 구현하기 때문에 배열길이를 +1 해줌

        for(int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = sc.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if(idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }

    }
}
