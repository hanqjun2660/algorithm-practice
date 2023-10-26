import java.util.Scanner;

public class BubbleSort2 {
    /**
     * 정렬을 마친후에도 비교하는 작업은 계속 진행될 수 있다.
     * 어떤 패스에서 교환 횟수가 0번이면 더 이상 정렬할 요소가 없다는 뜻이다.
     * 이때 정렬 작업을 멈추면 비교 연산이 많이 생략되어 짧은 시간에 정렬을 마칠 수 있다.
     * 아래 코드로 구현해보자
     */

    static void swap(int[] x, int index1, int index2) {
        int t = x[index1];
        x[index1] = x[index2];
        x[index2] = t;
    }

    static void bubbleSort(int[] x, int n) {
        for(int i = 0; i < n - 1; i++) {
            int exchg = 0;
            for(int j = n - 1; j > i; j--) {
                if(x[j - 1] > x[j]) {
                    swap(x, j - 1, j);
                    exchg++;
                }
            }
            if(exchg == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]= " + x[i]);
        }
    }
}
