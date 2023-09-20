import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("숫자를 입력하세요: ");
            n = sc.nextInt();
        } while(n <= 0);

        triangleLB(n);
        System.out.println("---------------------------------------");
        triangleLU(n);
        System.out.println("---------------------------------------");
        triangleRU(n);
        System.out.println("---------------------------------------");
        triangleRB(n);
        System.out.println("---------------------------------------");
    }

    static void triangleLB(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        for(int i = n; i >= 1; i--) {
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
