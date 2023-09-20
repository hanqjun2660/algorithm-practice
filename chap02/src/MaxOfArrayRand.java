import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    public static void main(String[] args) {
        Random rand = new Random();                 // Math.random은 0.0 ~ 0.1 사이의 난수를 생성하며, 범위를 지정하는데 제한이 있지만 Random 클래스는 범위를 지정할 수 있는 옵션이 있다.(정수, 실수 가능)
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for(int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최대값은 " + maxOf(height) + " 입니다.");
    }

    /**
     * 배열의 최대값을 구해서 반환
     * @param a
     * @return
     */
    static int maxOf(int[] a) {
        int max = a[0];

        for(int i = 0; i < a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
}
