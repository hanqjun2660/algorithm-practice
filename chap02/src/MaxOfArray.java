import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최대값을 구합니다.");

        System.out.print("사람 수 : ");                // 사람수를 입력받음
        int num = sc.nextInt();

        int[] height = new int[num];                    // 입력받은 사람의 수만큼 길이를 지정하여 배열을 생성함.

        for(int i = 0; i < num; i++) {                  // 입력받은 사람의 수만큼 키를 입력받음
            System.out.print("height[" + i + "]:");
            height[i] = sc.nextInt();
        }

        System.out.println("최대값은 " + maxOf(height) + " 입니다.");
    }

    /**
     *
     * @param a 입력받은 키가 들어있는 배열
     * @return  최대값을 반환
     */
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
