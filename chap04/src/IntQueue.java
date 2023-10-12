public class IntQueue {
    /**
     * 링 버퍼를 이용하여 기존에 만들었던 IntArrayQueue를 개선해보자
     * 링 버퍼를 이용하면 디큐 시 요소들을 옮기지 않아도 된다.
     */
    
    private int[] que;      // 큐용 배열
    private int capacity;   // 큐의 용량
    private int front;      // 맨 앞 요소 커서
    private int rear;       // 맨 뒤 요소 커서
    private int num;        // 현재 데이터 갯수

    // 예외
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    // 생성자
    public IntQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }
    
    // 큐에 데이터를 인큐
    public int enque(int x) throws OverflowIntQueueException {
        if(num >= capacity) {       // 저장된 갯수가 용량보다 크거나 같으면 -> 용량 이상으로 저장하려 하면 예외 던짐
            throw new OverflowIntQueueException();
        }

        que[rear++] = x;            // que에 입력받은 데이터를 추가하고 rear변수를 1 증가시킴
        num++;                      // 데이터가 추가 되었으니 데이터 개수 카운터인 num도 1 증가시킴.

        if(rear == capacity) {      // rear가 용량보다 커지면 문제가 발생하니 용량과 같을때 rear를 0으로 변경하여 문제 발생 없앰
            rear = 0;
        }

        return x;
    }

    // 큐에서 데이터를 디큐
    public int deque() throws EmptyIntQueueException {
        if(num <= 0) {                              // 저장된 데이터가 없을때 디큐 시 예외를 던짐
            throw new EmptyIntQueueException();
        }

        int x = que[front++];
        num--;                  // 데이터 1개가 디큐되었으니 저장 카운터를 1 감소시킴

        if(front == capacity) { // front도 용량보다 커지면 안되니 용량과 같아지면 front를 0으로 변경
            front = 0;
        }

        return x;
    }

    // 큐에서 데이터를 피크(front)
    public int peek() throws EmptyIntQueueException {
        if (num <= 0) {                             // 큐에 들어있는 데이터가 없으면 예외발생
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    // 큐를 비움
    public void clear() {
        num = front = rear = 0;
    }

    // 큐에서 x를 검색하여 인덱스 반환(검색 실패시(못찾을 시) -1을 반환)
    public int indexOf(int x) {
        for(int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if(que[idx] == x) {
                return idx;         // 검색 성공
            }
        }
        return -1;                  // 검색 실패
    }

    // 큐의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    // 큐에 쌓여있는 데이터의 갯수를 반환
    public int size() {
        return num;
    }

    // 큐가 비어있는지 확인
    public boolean isEmpty() {
        return num <= 0;
    }

    // 큐가 가득차있는지 확인
    public boolean isFull() {
        return num >= capacity;
    }

    // 큐 안의 모든 데이터를 front -> rear 순서로 출력
    public void dump() {
        if(num <= 0) {
            System.out.println("큐가 비었습니다.");
        } else {
            for(int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % capacity] + " ");
            }
            System.out.println();
        }
    }

    // 큐에서 x를 검색하여 맨 앞에서 몇 번째인지 반환
    public int search(int x) {
        for(int i = 0; i < num; i++) {
            if(que[(i + front) % capacity] == x) {
                return i + 1;
            }
        }
        return 0;       // 발견하지 못했을 때
    }
}
