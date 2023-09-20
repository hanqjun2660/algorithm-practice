import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int w;

        do {
            System.out.print("별을 출력할 만큼 숫자를 입력하세요: ");
            n = sc.nextInt();
            System.out.println("0이상 숫자만 입력해주세요.");
        } while(n <= 0);

        do {
            System.out.print("별을 몇개 단위로 줄바꿈 할것인지 숫자를 입력하세요: ");
            w = sc.nextInt();
        } while(w <= 0 || w > n);

        for(int i = 0; i < n; i++) {
            System.out.print("*");
            if(i % w == w - 1) {
                System.out.println();
            }
        }

        if(n % w != 0) {
            System.out.println();
        }

        /*String stars = "";
        for(int i = 1; i <= n; i++) {
            stars += "*";
        }

        System.out.print(stars);*/
    }
}
