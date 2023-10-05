/*
    클래스 메서드, 변수 && 인스턴스 메서드, 변수
    - 클래스 메서드와 변수는 인스턴스와 관계없이 클래스마다 한개씩 존재한다. -> (static)
    - 인스턴스 메서드와 변수는 인스턴스별로 만들어지며 인스턴스마다 하나씩 할당된다.
 */
class Id {
    private static int counter;
    private int id;

    public Id() { id = ++counter; }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }
}

public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());

        System.out.println("부여한 아이디의 갯수: " + Id.getCounter());      // 클래스 메서드를 호출할때는 클래스명.메서드로 호출
    }
}
