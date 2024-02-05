import java.util.Scanner;
import java.util.Stack;

public class RecurAndStack {

    static void recur(int n) {
        Stack<Integer> s = new Stack<>();

        while(true) {
            if(n > 0) {
                s.push(n);                  // 들어온 정수를 스택에 푸시하여 저장
                n = n - 1 ;                 // n - 1 수행
                continue;                   // 다시 while 처음으로 이동하여 n이 0이 될때까지 반복
            }
            if(s.isEmpty() != true) {       // 스택이 비어있지 않다면 (이미 위 조건에서 스택에 넣었기 때문에 있을거임)
                n = s.pop();                // 스택에 저장된 값들을 pop하여 출력
                System.out.println(n);
                n = n - 2;                  // 그리고 꼬리 재귀 부분을 n = n - 2를 수행
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요: ");
        int x = sc.nextInt();

        recur(x);
    }
}
