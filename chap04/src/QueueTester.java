import java.util.Scanner;

public class QueueTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> s = new Queue<String>(64);

        while(true) {
            System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (5) 검색 (0) 종료 : ");

            int menu = sc.nextInt();
            if(menu == 0) {
                break;
            }

            String x;
            switch (menu) {
                case 1:
                    System.out.print("큐에 추가할 데이터 : ");
                    x = sc.next();

                    try {
                        s.enque(x);
                    } catch (Queue.OverflowGQueueException e) {
                        System.out.println("큐가 가득 차 있습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = s.deque();
                        System.out.println("디큐한 데이터는 " + x + " 입니다.");
                    } catch (Queue.EmptyGQueueException e) {
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + " 입니다.");
                    } catch (Queue.EmptyGQueueException e) {
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
                case 5:
                    System.out.print("검색할 데이터를 입력하세요 : ");
                    x = sc.next();

                    int y = s.search(x);
                    if(y != 0) {
                        System.out.printf("%d번째 데이터로 인덱스 %d의 위치에 저장되어 있습니다.\n", y, s.indexOf(x));
                    } else {
                        System.out.println("큐에 해당 데이터가 없습니다.");
                    }
                    break;
            }
        }
    }
}
