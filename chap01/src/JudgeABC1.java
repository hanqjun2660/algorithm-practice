import java.util.Scanner;

public class JudgeABC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1,2,3 중 한가지만 입력하세요");
        int charNum = sc.nextInt();

        System.out.println("선택하신 숫자는 알파벳으로 " + ABC(charNum));
    }

    static String ABC(int charNum) {
        if(charNum == 1) {
            return "A 입니다.";
        } else if(charNum == 2) {
            return "B 입니다.";
        } else if(charNum == 3){
            return "C 입니다.";
        }
        return "존재하지 않습니다.";
    }
}
