import java.util.Scanner;

public class BubbleSort3 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void bubbleSort(int[] x, int n) {
        int k = 0;                              // x[k] 보다 앞쪽은 정렬을 마친 상태
        while(k < n - 1) {
            int last = n - 1;                   // 마지막 요소를 교환한 위치
            for(int j = n - 1; j > k; j--) {
                if(x[j - 1] > x[j]) {
                    swap(x, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("단순교환정렬(버블정렬)");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x, nx);                // 배열 x를 단순교환정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
