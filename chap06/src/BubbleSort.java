import java.util.Scanner;

public class BubbleSort {

    /**
     * 비교 조건 성립시 위치 교환
     * @param a
     * @param idx1
     * @param idx2
     */
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    /**
     * 배열을 돌며 앞뒤 요소를 비교
     * @param a
     * @param n
     */
    static void bubbleSort(int[] a, int n) {
        for(int i = 0; i < n - 1; i++) {
            for(int j = n - 1; j > i; j--) {
                if(a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전1)");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬하였습니다.");
        for(int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]= " + x[i]);
        }
    }
}
