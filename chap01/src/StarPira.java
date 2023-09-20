import java.util.Scanner;

public class StarPira {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("숫자를 입력해주세요 : ");
            n = sc.nextInt();
        } while (n <= 0);

        spira(n);
        npira(n);
    }

    static void spira(int n) {

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void npira(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print(i % 10);       // <- 그냥 i만 넣어도 동일하지만 한자리수가 넘어가면 피라미드 모양이 이상해지니 i % 10으로하여 한자리수로 유지해주자
            }
            System.out.println();
        }
    }
}
