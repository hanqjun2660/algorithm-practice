import java.util.Comparator;

public class X {
    /**
     * 자연 정렬이 되지 않은 배열에서 검색할땐 제네릭 메서드(binarySearch)를 사용한다.
     * 제네릭 메서드는 자료형에 구애받지 않고 3가지 매개 변수를 전달(검색대상, key, 배열의 나열순서 or 대소 관계 판단조건)
     *
     * 객체의 대소관계를 판단하는 comparator를 사용자가 직접 구현하려면
     * comparator 인터페이스를 구현한 클래스를 정의하고 그 클래스형의 인스턴스를 생성해야한다.
     * 그 후 매개변수로 전달된 두 객체의 대소 관계를 비교해 return하는 compare메서드를 작성한다.
     */

    // 필드, 메서드 등...
    public static final Comparator<T> COMPARATOR = new Comp();      // Comparator 인터페이스와 compare 메서드를 구현한 클래스의 인스턴스를 생성

    private static class Comp implements Comparator<T> {
        public int compare(T d1, T d2) {
            // d1이 d2보다 크면 양수
            // d1이 d2보다 작으면 음수
            // d1이 d2와 같으면 0
            return 0;
        }
    }
}
