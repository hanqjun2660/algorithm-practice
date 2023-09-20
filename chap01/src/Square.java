import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("입력한 수만큼 행이 출력됩니다 : ");
            n = sc.nextInt();
        } while(n < 0);

        for(int i = 1; i <= n; i++) {
            System.out.println("*".repeat(n));
        }
    }
}
