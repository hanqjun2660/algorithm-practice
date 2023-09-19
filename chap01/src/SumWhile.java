import java.util.Scanner;

public class SumWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지 정수의 합을 구합니다.");
        System.out.print("n값 : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n) {
            sum += i;
            i++;
        }

        System.out.println("반복이 끝난 i의 값은? : " + i);
        System.out.println("1부터 " + n + " 까지의 합은 " + sum + " 입니다.");
    }
}
