import java.util.Scanner;

public class BinSearchX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");        // 맨 앞 요소를 입력받음
        x[0] = sc.nextInt();

        for(int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = sc.nextInt();
            } while(x[i] < x[i - 1]);       // 입력된 값이 바로앞의 요소보다 작으면 다시 입력받음(오름차순으로 입력)
        }

        System.out.print("검색 값 : ");
        int ky = sc.nextInt();

        int idx = binSearchX(x, num, ky);

        if(idx == -1) {
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }

    /**
     * 배열 내 동일한 값이 있을 경우 가장 앞쪽 요소의 인덱스를 찾음
     * @param x
     * @param num
     * @param ky
     * @return
     */
    private static int binSearchX(int[] x, int num, int ky) {

        int first = 0;
        int last = num - 1;

        do {
            int middle = (first + last) / 2;        // 검색범위 중간 인덱스
            if(x[middle] == ky) {                   // 중간 인덱스 요소가 찾는값과 동일하다면 반복을 통해 중복된 값 중 가장 앞에 위치한 요소의 위치를 찾음
                for(; middle > first; middle--) {
                    if(x[middle - 1] < ky) {
                        break;
                    }
                }
                return middle;
            } else if(x[middle] < ky) {             // 중간 인덱스 요소가 찾는값보다 작으면 검색범위를 앞쪽으로 절반으로 줄임
                first = middle + 1;
            } else {
                last = middle - 1;                  // 아니면 검색 범위를 뒤쪽으로 절반으로 줄임
            }
        } while(first <= last);         // 검색범위 시작 인덱스가 검색범위 마지막 인덱스보다 커지면 멈춤

        return -1;                      // 찾는값이 없으면 (검색실패) -1을 돌려주자.
    }
}
