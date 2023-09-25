import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();        // clone메서드로 기존에 있던 배열을 복사해 참조할 수 있다.

        b[3] = 0;

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}
