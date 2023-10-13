public class IntDeque {
    /**
     * 덱(Deque)는 양방향에서 요소를 추가하고 제거할 수 있는 큐이다.
     * 큐는 rear에 요소를 추가하고 front의 값을 디큐하는 방식이지만
     * 덱(Deque)는 맨앞 또는 맨뒤에서 값을 추가하고 삭제할 수 있다. (양방향 대기열)
     * 
     * 스택처럼 사용할수도있고 큐처럼 사용할 수도 있다??
     * 구현 해보면서 알아보자
     */

    // 예외
    public class EmptyIntDequeException extends RuntimeException {
        public EmptyIntDequeException() {}
    }

    public class OverflowIntDequeException extends RuntimeException {
        public OverflowIntDequeException() {}
    }

    private int[] que;
    private int capacity;       // 용량
    private int num;            // 저장된 데이터의 갯수
    private int front;          // 맨앞 요소 커서
    private int rear;           // 맨뒤 요소 커서

    // 생성자
    public IntDeque(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    // 덱(deque) front에 데이터를 인큐
    public int enqueFront(int x) throws OverflowIntDequeException {
        if(num >= capacity) {                           // 용량이 가득찼을때 예외 던짐
            throw new OverflowIntDequeException();
        }
        num++;
        if(--front < 0) {               // 덱의 front에 요소를 추가하기 때문에 인덱스가 front를 1 감소시켰을 때 음수인경우 배열의 마지막 인덱스로 이동시킨다.
            front = capacity - 1;
        }
        que[front] = x;
        return x;
    }

    // 덱(deque) rear에 데이터를 인큐
    public int enqueRear(int x) throws OverflowIntDequeException {
        if(num >= capacity) {
            throw new OverflowIntDequeException();
        }
        que[rear++] = x;
        num++;
        if(rear == capacity) {
            rear = 0;
        }
        return x;
    }

    // 덱(deque)의 맨앞 데이터를 디큐
    public int dequeFront() throws EmptyIntDequeException {
        if(num <= 0) {
            throw new EmptyIntDequeException();
        }

        int x = que[front++];
        num--;

        if(front == capacity) {
            front = 0;
        }
        return x;
    }

    public int dequeRear() throws EmptyIntDequeException {
        if(num <= 0) {
            throw new EmptyIntDequeException();
        }

        num--;

        if(--rear < 0) {
            rear = capacity - 1;
        }
        return que[rear];
    }

    //--- 덱의 맨앞 데이터를 피크(맨앞 데이터를 들여다봄 ) ---*/
    public int peekFront() throws EmptyIntDequeException {
        if (num <= 0)
            throw new EmptyIntDequeException();				// 덱이 비어있음
        return que[front];
    }

    //--- 덱의 맨끝에서 데이터를 피크(맨끝 데이터를 들여다봄 ) ---*/
    public int peekRear() throws EmptyIntDequeException {
        if (num <= 0)
            throw new EmptyIntDequeException();				// 덱이 비어있음
        return que[rear == 0 ? capacity - 1 : rear - 1];
    }

    //--- 덱에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환합니다 ---//
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x)											// 검색 성공
                return idx;
        }
        return -1;														// 검색 실패
    }

    //--- 덱에서 x를 검색하여 맨앞에서 몇 번째인가(발견하지 못하면 0)를 반환합니다 ---//
    public int search(int x) {
        for (int i = 0; i < num; i++)
            if (que[(i + front) % capacity]  == x)	// 검색 성공
                return i + 1;
        return 0;																	// 검색 실패
    }

    //--- 덱을 비웁니다 ---//
    public void clear() {
        num = front = rear = 0;
    }

    //--- 덱의 용량을 반환합니다 ---//
    public int getCapacity() {
        return capacity;
    }

    //--- 덱에 쌓여있는 데이터수를 반환합니다 ---//
    public int size() {
        return num;
    }

    //--- 덱이 비어 있는가? ---//
    public boolean isEmpty() {
        return num <= 0;
    }

    //--- 덱이 가득 찼는가? ---//
    public boolean isFull() {
        return num >= capacity;
    }

    //--- 덱 안의 모든 데이터를 맨앞 → 맨끝의 순서로 출력 ---//
    public void dump() {
        if (num <= 0)
            System.out.println("덱이 비어 있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[(i + front) % capacity] + " ");
            System.out.println();
        }
    }

}
