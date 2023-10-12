public class Queue <E>{
    private E[] que;
    private int capacity;
    private int num;
    private int front;
    private int rear;

    // 예외
    public static class EmptyGQueueException extends RuntimeException {     // 제네릭 클래스는 RuntimeException을 상속받지 못한다.(static으로 하면 가능)
        public EmptyGQueueException() {}
    }

    public static class OverflowGQueueException extends RuntimeException {
        public OverflowGQueueException() {}
    }

    // 생성자
    public Queue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;

        try {
            que = (E[]) new Object[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public E enque(E x) throws OverflowGQueueException {
        if(num >= capacity) {       // 저장용량보다 저장된 용량이 넘치는지 확인
            throw new OverflowGQueueException();
        }

        que[rear++] = x;
        num++;

        if(rear == capacity) {
            rear = 0;
        }

        return x;
    }

    public E deque() throws EmptyGQueueException {
        if(isEmpty()) {
            throw new EmptyGQueueException();
        }

        E x = que[front++];
        num--;

        if(front == capacity) {
            front = 0;
        }

        return x;
    }

    public E peek() throws EmptyGQueueException {
        if(isEmpty()) {
            throw new EmptyGQueueException();
        }
        return que[front];
    }

    public int indexOf(E x) {
        for(int i = 0; i < num; i++) {
            if(que[(i + front) % capacity].equals(x)) {
                return i + front;
            }
        }
        return -1;
    }

    public int search(E x) {
        for(int i = 0; i < num; i++) {
            if(que[(i + front) % capacity].equals(x)) {
                return i + 1;
            }
        }
        return -1;
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        if(isEmpty()) {
            System.out.println("큐가 비어있습니다.");
        } else {
            for(int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % capacity].toString() + " ");
            }
            System.out.println();
        }
    }
}
