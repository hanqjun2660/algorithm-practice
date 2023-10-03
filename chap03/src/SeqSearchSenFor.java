import java.util.Scanner;

public class SeqSearchSenFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num+1];

        for(int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = sc.nextInt();

        int idx = seqSearchSenFor(x, num, ky);

        if(idx == -1) {
            System.out.print("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }

    /**
     * SeqSearchSen Class의 메서드를 while -> for로 변경해보았다.
     * @param x
     * @param num
     * @param ky
     * @return
     */
    static int seqSearchSenFor(int[] x, int num, int ky) {

        int i;

        x[num] = ky;

//      for (i = 0 ; x[i] != ky; i++); 와 같이 하여도 동일하다.
        for(i = 0; i < num; i++) {
            if(x[i] == ky) {
                break;
            }
        }

        return i == num ? -1 : i;
    }
}
