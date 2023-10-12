public class IntArrayQueue {
    private int[] que;          // 큐용 배열
    private int capacity;       // 큐 용량
    private int num;            // 현재 데이터 개수

    // 예외
    public class EmptyIntArrayQueueException extends RuntimeException {
        public EmptyIntArrayQueueException() {}
    }

    public class OverflowIntArrayQueueException extends RuntimeException {
        public OverflowIntArrayQueueException() {}
    }

    // 생성자
    public IntArrayQueue(int maxlen) {
        num = 0;
        capacity = maxlen;

        try {
            que = new int[capacity];        // 입력된 용량만큼 Queue용 배열 생성
        } catch (OutOfMemoryError e) {
            capacity = 0;                   // 생성할 수 없을땐 용량을 0으로 재대입.
        }
    }

    // 큐에 데이터를 인큐
    public int enque(int x) throws OverflowIntArrayQueueException {
        if(num >= capacity) {       // 용량보다 입력된 데이터가 많거나 같으면 예외발생
            throw new OverflowIntArrayQueueException();
        }
        que[num++] = x;     // 배열에 x를 추가하고 num을 1 증가시킴
        return x;
    }

    // 큐에 데이터를 디큐
    public int deque() throws EmptyIntArrayQueueException{
        if(num <= 0) {                                  // num이 0 이하면 저장된 데이터가 없다는 뜻
            throw new EmptyIntArrayQueueException();    // 저장된 데이터가 없으니 비었다는 예외를 던지자.
        }
        int x = que[0];                                 // front에 저장된 데이터를 변수에 저장
        for(int i = 0; i < num - 1; i++) {              // 배열의 처음부터 끝까지 반복하며 데이터를 한칸씩 이동시킨다.
            que[i] = que[i + 1];
        }
        num--;                                          // 디큐가 완료되고 나면 num(저장된 데이터 갯수)을 1 감소시킨다.
        return x;                                       // 제거된 데이터를 반환한다.
    }

    // 큐에서 데이터를 피크(rear 데이터)
    public int peek() throws EmptyIntArrayQueueException {
        if(num <= 0) {
            throw new EmptyIntArrayQueueException();
        }
        return que[num - 1];
    }

    public int indexOf(int x) {
        for(int i = 0; i < num; i++) {      // 배열의 첫부터 끝까지(저장된 데이터의 개수만큼) 반복하며 선형검색
            if(que[i] == x) {               // 찾는 값과 동일한 값이 있다면
               return i;                    // 해당 인덱스를 return
            }
        }
        return -1;                          // 검색 실패시 return
    }

    // 큐를 비운다.
    public void clear() {
        num = 0;            // 실제로 메모리상에서 지워지지 않고 참조되지 않아 가비지컬렉터가 정리한다.
    }

    // 큐의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    // 큐에 쌓여있는 데이터의 수를 반환
    public int size() {
        return num;
    }

    // 큐가 비어있는지 확인
    public boolean isEmpty() {
        return num <= 0;
    }

    // 큐가 가득찼는지 확인
    public boolean isFull() {
        return num >= capacity;
    }

    // 큐 안의 모든 데이터를 맨앞(front) - > 끝까지(rear) 순서로 출력
    public void dump() {
        // if(num <= 0)       큐가 비어있을때(isEmpty로 사용을해보자)
        if(isEmpty()) {
            System.out.println("큐가 비어있습니다.");
        } else {
            for(int i = 0; i < num; i++) {
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }
}
