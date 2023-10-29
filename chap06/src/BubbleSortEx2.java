import java.util.Scanner;

public class BubbleSortEx2 {

    static void swap(int[] x, int index1, int index2) {
        int t = x[index1];
        x[index1] = x[index2];
        x[index2] = t;
    }

    static void bubbleSort(int[] x, int nx) {
        int ccnt = 0;       // 비교횟수
        int scnt = 0;       // 교환횟수

        for(int i = 0; i < nx - 1; i++) {
            int exchg = 0;      // 패스에 의한 교환 횟수
            System.out.printf("패스%d : \n", i + 1);

            for(int j = nx - 1; j > i; j--) {
                for(int m = 0; m < nx - 1; m++) {
                    System.out.printf("%3d %c", x[m], (m != j-1) ? ' ' : (x[j-1] > x[j]) ? '+' : '-');
                }
                System.out.printf("%3d\n", x[nx - 1]);

                ccnt++;

                if(x[j - 1] > x[j]) {
                    swap(x, j - 1, j);
                    exchg++;
                    scnt++;
                }
            }
            for(int m = 0; m < nx; m++) {
                System.out.printf("%3d ", x[m]);
            }
            System.out.println();
            if(exchg == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("단순교환정렬(버블 정렬)");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }
        
        bubbleSort(x, nx);;     // 배열 x를 단순교환정렬

        System.out.println("오름차순으로 정렬하였습니다.");
        for(int i = 0; i < nx; i++) {
            System.out.print(" x[" + i + "]=" + x[i]);
        }
    }
}
