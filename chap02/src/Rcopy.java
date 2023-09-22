import java.util.Arrays;
import java.util.Scanner;

public class Rcopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen;

        System.out.println("배열을 복사하고 역순으로 정렬합니다.");
        System.out.print("배열의 길이를 입력하세요 : ");
        arrLen = sc.nextInt();

        int[] x = new int[arrLen];
        int[] b = new int[x.length];

        for(int i = 0; i < arrLen; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(x));

        for(int i = 0; i < x.length / 2; i++) {
            System.out.println("a[" + i + "]과 a[" + (x.length-i-1) + "]을 교환합니다.");
            swap(x, i, x.length-i-1);
            b = x;
            System.out.println("int[] b: " + Arrays.toString(b));
        }

        System.out.println("복사 후 역순 정렬을 마쳤습니다.");

    }

    static void swap(int[] x, int idx1, int idx2) {
        int t = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = t;
    }
}
