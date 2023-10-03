import java.util.Scanner;

public class SearchIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색 값: ");
        int ky = sc.nextInt();

        int count = searchIdx(x, num, ky, y);

        if(count == 0) {
            System.out.println("그 값은 요소에 없습니다.");
        } else {
            for(int i = 0; i < count; i++) {
                System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
            }
        }
    }

    private static int searchIdx(int[] x, int num, int ky, int[] y) {

        int count = 0;

        for(int i = 0; i < num; i++) {
            if(x[i] == ky) {
                y[count++] = i;         // count값을 인덱스로 사용한 후 count 값을 1 증가시킴(조건에 맞는 요소의 인덱스 번호를 저장함)
            }
        }

        return count;
    }
}
