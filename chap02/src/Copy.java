import java.util.Arrays;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력된 배열을 복사합니다.");
        System.out.print("배열의 길이를 입력하세요 :");

        int length = sc.nextInt();
        int[] arr1 = new int[length];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("arr1[" + i + "] : ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("배열이 복사되었습니다.");
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(copy(arr1)));
    }

    static int[] copy(int[] arr1) {
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
        return arr2;
    }
}
