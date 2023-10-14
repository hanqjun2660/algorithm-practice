import java.util.Scanner;

public class Recur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();

        recur(x);
    }

    static void recur(int x) {
        if(x > 0) {
            recur(x - 1);
            System.out.println(x);
            recur(x - 2);
        }
    }
}
