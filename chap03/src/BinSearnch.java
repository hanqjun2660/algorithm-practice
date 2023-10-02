import java.util.Scanner;

public class BinSearnch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];         // 요솟수가 num인 배열
        
        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");     // 첫 요소를 입력 받음
        x[0] = sc.nextInt();

        for(int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = sc.nextInt();
            } while(x[i] < x[i-1]);     // 바로 앞 요소보다 작으면 다시 입력받음
        }

        System.out.print("검색할 값: ");
        int ky = sc.nextInt();

        int idx = binSearch(x, num, ky);

        if(idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }

    /**
     * 이진검색을 활용하면 선형검색보다 빠르게 검색할 수 있다.
     * 이진검색은 검색을 반복할때마다 범위가 절반으로 줄어들기 때문에 순차적으로 끝까지 검색하는 선형검색보다 빠르다.
     * @param x
     * @param num
     * @param ky
     * @return
     */
    static int binSearch(int[] x, int num, int ky) {

        int pl = 0;             // 검색 범위의 첫 인덱스
        int pr = num - 1;       // 검색 범위의 마지막 인덱스

        do {
            int pc = (pl + pr) / 2;     // 검색 범위의 중간 인덱스
            if(x[pc] == ky) {
                return pc;              // 검색 성공
            } else if(x[pc] < ky) {
                pl = pc + 1;            // 검색범위를 뒤쪽 절반으로 좁힘
            } else {
                pr = pc - 1;            // 검색범위를 앞쪽 절반으로 좁힘
            }
        } while(pl <= pr);

        return -1;                      // 검색 실패시
    }
}
