import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 길이를 입력하세요: ");
        int arrLen = sc.nextInt();

        int[] x = new int[arrLen];

        for(int i = 0; i < arrLen; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        reverse(x);

        System.out.println("배열의 요소를 역순으로 정렬하였습니다.");
        System.out.println("x = " + Arrays.toString(x));
    }

    static void reverse(int[] x) {
        for(int i = 0; i < x.length / 2; i++) {   // 양 끝 배열 요소끼리 위치를 교환해야하기 때문에 배열의 길이 / 2 만큼만 반복을 실행
            swap(x, i, x.length-i-1);       // 인덱스가 0부터 시작하기 때문에 -1을 해준다. i만큼 빼야 다음 인덱스를 넘길 수 있다.
        }
    }

    static void swap(int[] x, int idx1, int idx2) {
        // 매개변수로 들어온 인덱스의 위치를 서로 교환해준다.
        int t = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = t;
    }
}
