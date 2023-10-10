import java.util.Scanner;

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

    // 스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException{
        if(ptr >= capacity) {                       // 스택이 가득찼을때 예외발생
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if(ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    // 스택에서 가장 윗 데이터를 확인하는 메서드
    public int peek() throws EmptyIntStackException {
        if(ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }
}
