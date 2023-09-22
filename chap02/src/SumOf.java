import java.util.Random;
import java.util.Scanner;

public class SumOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 요소의 합계를 구합니다.");
        System.out.print("배열의 길이를 입력해주세요 : ");

        int a = sc.nextInt();
        int[] x = new int[a];

        for(int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.println("배열 요소 전체의 합계는 " + sum(x) + " 입니다.");

    }

    static int sum(int[] x) {
        int result = 0;
        for(int i = 0; i < x.length; i++) {
            result += x[i];
        }
        return result;
    }
}
