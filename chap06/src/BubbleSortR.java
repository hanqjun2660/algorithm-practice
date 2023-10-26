import java.util.Scanner;

public class BubbleSortR {
    /**
     * BubbleSort 클래스에선 뒤쪽 -> 앞쪽으로 비교하며 진행되었다.
     * 이번에는 앞쪽 -> 뒤쪽으로 비교하면서 진행해보자
     */

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for(int i = n - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
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
