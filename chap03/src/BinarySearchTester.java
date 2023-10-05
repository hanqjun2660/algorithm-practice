import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = sc.nextInt();

        for(int i = 1; i < num; i++) {
            do {
                System.out.println("x[" + i + "]: ");
                x[i] = sc.nextInt();;
            } while (x[i] < x[i-1]);            // 바로 앞의 요소보다 작으면 다시 입력받음
        }

        System.out.print("검색할 값: ");
        int ky = sc.nextInt();

        int idx = Arrays.binarySearch(x, ky);           // Arrays.binarySearch 메서드로 이진탐색을 쉽게 할 수 있다. 다만 중복된 값중 제일 처음 찾은 요소만 리턴한다.

        if(idx < 0) {       // Arrays.binarySearch 검색 실패로는 음수로 넘어온다.
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "] 에 있습니다.");
        }
    }
}
