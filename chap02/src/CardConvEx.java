import java.util.Scanner;

public class CardConvEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] Arr = new int[32];

        System.out.println("10진수를 기수변환 합니다.");

        do {
            System.out.print("변환하는 음이 아닌 정수 : ");
            num = sc.nextInt();
        } while (num < 0);

        int count = conversion(num, Arr);       // 변환된 2진수의 길이를 알아야 그만큼의 배열 인덱스만 출력할 수 있게 하는 용도로 해당 변수가 필요함

        System.out.print("2진수로 ");
        for(int i = 0; i < count; i++) {
            System.out.print(Arr[i]);
        }
        System.out.print("입니다.");
    }

    static int conversion(int num, int[] Arr) {
        int digits = 0;
        System.out.println("2 |" + num);

        do {
            Arr[digits++] = num % 2;
            System.out.println("+ ----------");
            System.out.println("2 |" + num / 2 + "  --- " + num % 2);
            num /= 2;
        } while (num != 0);

        // 역순으로 뒤집어야 진법 변환이 마무리 된다.
        for(int i = 0; i < digits / 2; i++) {
            int t = Arr[i];
            Arr[i] = Arr[digits-i-1];
            Arr[digits-i-1] = t;
        }

        return digits;
    }
}
