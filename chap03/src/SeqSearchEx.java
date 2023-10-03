import java.util.Scanner;

public class SeqSearchEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색 값: ");
        int ky = sc.nextInt();

        int idx = seqSearchEx(x, num, ky);

        if(idx == -1) {
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }

    static int seqSearchEx(int[] x, int num, int ky) {

        System.out.print("   |");
        for(int i = 0; i < num; i++) {
            System.out.printf("%4d" ,i);        // %는 형식지정자 4는 필드의 너비, d는 10진수 정수
        }
        System.out.println();

        System.out.print("---+");
        for(int j = 0; j < 4 * num + 2; j++) {      // 위에서 4너비를 차지하니 num * 4 + 2만큼 반복하자
            System.out.print("-");
        }
        System.out.println();

        for(int k = 0; k < num; k++) {              // 배열 길이만큼 행 출력을 위해 요솟수만큼 반복하자
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (k * 4) + 3), "");      // '*' 출력 (현재 검색중인 부분 출력을 위해)
            System.out.printf("%3d|", k);           // 배열의 인덱스를 표시하고 k는 3자리와 '|'를 출력해 표처럼 출력한다.
            for(int i = 0; i < num; i++) {
                System.out.printf("%4d", x[i]);     // 배열의 요소를 출력
            }
            System.out.println("\n   |");           // 개행하고 '|' 출력

            if(x[k] == ky) {
                return k;
            }
        }

        return -1;
    }
}
