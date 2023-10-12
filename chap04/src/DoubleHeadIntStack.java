public class DoubleHeadIntStack {
    /**
     * 하나의 배열을 공유하여 2개의 스택을 구성해보자 (StackA 왼쪽 끝부터 / StackB 오른쪽 끝부터)
     */

    private int[] stk;
    private int capacity;       // 스택의 용량(A,B의 햡계)
    private int ptrA;           // 스택 포인터 A
    private int ptrB;           // 스택 포인터 B

    public enum AorB {StackA, StackB};

    // 실행 시 예외: 스택이 비어있음
    public class EmptyDoubleHeadIntStackException extends RuntimeException {
        public EmptyDoubleHeadIntStackException(){}
    }

    // 실행 시 예외: 스택이 가득 참
    public class OverflowDoubleHeadIntStackException extends RuntimeException {
        public OverflowDoubleHeadIntStackException() {}
    }

    // 생성자
    public DoubleHeadIntStack(int maxlen) {
        ptrA = 0;
        ptrB = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];        // 스택 본체열 배열 생성
        } catch (OutOfMemoryError e) {
            capacity = 0;                   // 생성할 수 없음
        }
    }

    // push
    public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException {
        if(ptrA >= ptrB + 1) {      // 스택이 가득 참
            throw new OverflowDoubleHeadIntStackException();
        }
        switch (sw) {
            case StackA: stk[ptrA++] = x; break;        // stackA는 왼쪽부터 쌓이기 때문에 ptr을 ++하여 1씩증가
            case StackB: stk[ptrB--] = x; break;        // stackB는 오른쪽 끝부터 쌓이기 때문에 ptr을 --하여 1씩 감소
        }
        return x;
    }

    // pop
    public int pop(AorB sw) throws EmptyDoubleHeadIntStackException {
        int x = 0;
        switch (sw) {
            case StackA:
                if(ptrA <= 0) {
                    throw new EmptyDoubleHeadIntStackException();
                }
                x = stk[--ptrA];
                break;
            case StackB:
                if(ptrB <= 0) {
                    throw new EmptyDoubleHeadIntStackException();
                }
                x = stk[++ptrB];
                break;
        }
        return x;
    }

    // peek
    public int peek(AorB sw) throws EmptyDoubleHeadIntStackException {
        int x = 0;
        switch (sw) {
            case StackA:
                if(ptrA <= 0) {
                    throw new EmptyDoubleHeadIntStackException();
                }
                x = stk[ptrA - 1];
                break;
            case StackB:
                if(ptrB <= 0) {
                    throw new EmptyDoubleHeadIntStackException();
                }
                x = stk[ptrB + 1];
                break;
        }
        return x;
    }

    // indexOf(검색)
    public int indexOf(AorB sw, int x) {
        switch (sw) {
            case StackA:
                for(int i = ptrA - 1; i >= 0; i--) {
                    if(stk[i] == x) {
                        return i;
                    }
                }
                break;
            case StackB:
                for(int i = ptrB + 1; i < capacity; i++) {
                    if(stk[i] == x) {
                        return i;
                    }
                }
                break;
        }
        return -1;      // 검색 실패
    }

    // clear
    public void clear(AorB sw) {
        switch (sw) {       // 스택이 2개이기 때문에 어떤 스택을 비울지 선택하여 비움
            case StackA: ptrA = 0; break;
            case StackB: ptrB = capacity - 1; break;        // 배열의 마지막으로 돌려야하기 때문에 용량 -1을 하면 마지막 인덱스로 간다.
        }
    }

    // 스택 용량 확인(A와 B 스택의 합계 용량)
    public int getCapacity() {
        return capacity;
    }

    // 스택에 쌓인 데이터의 수
    public int size(AorB sw) {
        switch (sw) {
            case StackA: return ptrA;
            case StackB: return capacity - ptrB -1;
        }
        return 0;
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty(AorB sw) {
        switch (sw) {
            case StackA: return ptrA <= 0;
            case StackB: return ptrB >= capacity - 1;
        }
        return true;
    }

    // 스택이 가득차 있는지 확인
    public boolean isFull() {
        return ptrA >= ptrB + 1;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기의 순서로 출력
    public void dump(AorB sw) {
        switch (sw) {
            case StackA:
                if(ptrA <= 0) {
                    System.out.println("스택이 비어 있습니다.");
                } else {
                    for (int i = 0; i < ptrA; i++) {
                        System.out.print(stk[i] + " ");
                    }
                    System.out.println();
                }
                break;
            case StackB:
                if(ptrB >= capacity - 1) {
                    System.out.println("스택이 비어 있습니다.");
                } else {
                    for(int i = capacity - 1; i > ptrB; i--) {
                        System.out.print(stk[i] + " ");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
