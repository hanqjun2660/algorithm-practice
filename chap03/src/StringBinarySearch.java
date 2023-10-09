import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 자바에서 사용되는 키워드로 만든 String 배열
        String[] x = {
                "abstract", "assert", "boolean", "break", "byte",
                "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else",
                "enum", "extends", "final", "finally", "float",
                "for", "goto", "if", "implements", "import",
                "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws",
                "transient", "try", "void", "volatile", "while"
        };

        System.out.print("원하는 키워드를 입력하세요: ");
        String ky = sc.next();

        /**
         * 자연정렬 상태에선 binarySearch 메서드는 Object형으로 데이터를 전달받았다.
         * binarySearch 메서드에서 배열과 key로 간단하게 검색할 수 있는 이유는
         * String class의 Comparable<T> 인터페이스와 compareTo 메서드를 구현하고 있기 때문이다.
         */
        int idx = Arrays.binarySearch(x, ky);       // 배열 x에서 값이 ky인 요소를 검색

        if(idx < 0) {
            System.out.println("해당 키워드가 없습니다.");
        } else {
            System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");
        }
    }
}
