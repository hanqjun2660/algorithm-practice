import java.util.Scanner;

public class CardConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, cd, dno, retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36)");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.print(cd + "진수로 ");
            for(int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.println("한번 더 할까요? (1...예/2...아니오)");
            retry = sc.nextInt();

        } while(retry == 1);
    }

    static int cardConv(int no, int cd, char[] cno) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            cno[digits++] = dchar.charAt(no % cd);      // cd로 나눈수를 저장
            no /= cd;
        } while(no != 0);

        for(int i = 0; i < digits / 2; i++) {       // 배열 cno의 숫자 문자열을 역순으로 정렬
            char t = cno[i];
            cno[i] = cno[digits-i-1];
            cno[digits-i-1] = t;
        }

        return digits;
    }
}
