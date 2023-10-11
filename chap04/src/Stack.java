public class Stack <E> {

    private E [] stk;       // 스택 배열
    private int capacity;   // 스택 용량
    private int ptr;        // 스택 포인터

    // 실행 시 예외 : 스택이 비어있음
    public static class EmptyGstackException extends RuntimeException {
        public EmptyGstackException(){}
    }

    // 실행 시 예외 : 스택이 가득 참
    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() {}
    }

    public Stack(int maxlen) {
        ptr = 0;
        capacity = maxlen;

        try {
            stk = (E[])new Object[capacity];            // 어떤 타입이 들어올지 모르니 Object형으로 받고 E타입으로 형변환
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    // push
    public E push(E x) throws OverflowGstackException {
        if(ptr >= capacity) {                       // ptr(스택포인터)가 스택 용량보다 크면 저장할 수 없으니 예외를 발생
            throw new OverflowGstackException();
        }
        return stk[ptr++] = x;                      // 정상적으로 푸시가 가능하면 stk에 x를 저장하고 포인터를 1 증가시킨다.
    }

    // pop
    public E pop() throws EmptyGstackException {
        if(ptr <= 0) {                              // ptr이 0보다 작거나 같으면 스택에 아무것도 없다는 뜻임
            throw new EmptyGstackException();       // 스택이 비어있는데 pop을 하면 예외발생
        }
        return stk[--ptr];                          // 정상적으로 pop이 가능하면 ptr을 1 감소시키고 해당 요소를 반환함
    }

    // peek (스택 꼭대기 데이터 확인)
    public E peek() throws EmptyGstackException {
        if(ptr <= 0) {
            throw new EmptyGstackException();
        }
        return stk[ptr -1];
    }

    // clear
    public void clear() {
        ptr = 0;
    }

    // indexOf
    public int indexOf(E x) {     // 꼭대기부터 스택을 선형검색
        for(int i = ptr - 1; i >= 0; i--) {
            if(stk[i].equals(x)) {
                return i;                   // 검색 성공시
            }
        }
        return -1;                          // 검색 실패시
    }

    // 스택용량 확인
    public int getCapacity() {
        return capacity;
    }

    // 스택에 쌓여있는 데이터수 확인
    public int size() {
        return ptr;
    }

    // 스택이 비어있는지
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득차 있는지
    public boolean isFull() {
        return ptr >= capacity;
    }

    // 스택 내 모든 데이터를 바닥 -> 꼭대기의 순서로 출력
    public void dump() {
        if(isEmpty()) {
            System.out.println("스택이 비어있습니다.");
        } else {
            for(int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
