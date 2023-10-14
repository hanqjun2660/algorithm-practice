import java.util.Scanner;

public class Recur2 {

    /**
     * recur2 상향식 분석
     * recur2(-1) 아무것도 출력하지 않음
     * recur2(0) 아무것도 출력하지 않음
     * recur2(1)   recur2(-1) 1 recur2(0)   1
     * recur2(2)   recur2(0) 2 recur2(1)    21
     * recur2(3)   recur2(1) 3 recur2(2)    1321
     * recur2(4)   recur2(2) 4 recur2(3)    2141321
     */

    static void recur2(int x) {
        if(x > 0) {
            recur2(x - 2);
            System.out.println(x);
            recur2(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        recur2(x);
    }
}
