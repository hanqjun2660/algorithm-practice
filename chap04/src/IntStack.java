public class IntStack {

    /**
     * 스택을 생성할 때 용량(스택에 쌓을 수 있는 최대 데이터 수)을 결정하는
     * 고정 길이 스택 생성
     */

    private int[] stk;          // 스택용 배열
    private int capacity;       // 스택 용량
    private int ptr;            // 스택 포인터

    // 실행 시 예외: 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    // 실행 시 예외: 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }
    
    // 생성자
    public IntStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];        // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e) {      // 생성할 수 없음
            capacity = 0;
        }
    }
}
