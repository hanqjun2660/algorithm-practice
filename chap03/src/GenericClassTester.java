public class GenericClassTester {
    /**
     * 제네릭스는 처리대상의 자료형의 의존하지 않도록 클래스(인터페이스)를 구현하는 기능이다.
     * 자료형에 의존하지 않기 때문에 범용으로 사용할 수 있다.\
     * 
     * 파라미터 이름을 작성하는 방법은 아래와 같다.
     * 1. 대문자는 1개를 사용(소문자x)
     * 2. 컬렉션 내부 요소 자료형은 element의 첫 글자인 E를 사용
     * 3. Map 내 키와 값의 자료형은 K와 V를 사용
     * 4. 일반적인 자료형은 T를 사용
     */

    // 제네릭 클래스의 매개변수를 T라고 작성함
    static class GenericClass<T> {
        private T xyz;

        GenericClass(T t) {     // 생성자
            this.xyz = t;
        }

        T getXyz() {            // getter
            return xyz;
        }
    }

    public static void main(String[] args) {

        // 제네릭 클래스를 사용해보자
        GenericClass<String> s = new GenericClass<String>("ABC");       // 아래와 같이 자료형에 의존적이지 않음
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
