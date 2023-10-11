import java.util.Scanner;

public class IntStackTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack s = new IntStack(64);      // 최대 64개를 푸시할 수 있는 스택 생성

        while(true) {
            System.out.println();
            System.out.printf("현제 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 클리어 (6)검색 (7)비어있는지,가득찼는지 (0) 종료:");

            int menu = sc.nextInt();

            if(menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1:                             // 푸시
                    System.out.print("데이터: ");
                    x = sc.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득찼습니다.");
                    }
                    break;
                case 2:                             // 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 3:                             // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4:                             // 덤프
                    s.dump();
                    break;

                case 5:
                    s.clear();                      // 클리어
                    break;
                case 6:
                    System.out.print("검색할 요소를 입력하세요: ");
                    x = s.indexOf(sc.nextInt());                            // 검색
                    System.out.println("검색한 요소는 " + x + "입니다.");
                    break;
                case 7:
                    boolean status;
                    while(true) {
                        System.out.print("비어있는지 확인하려면 1번, 가득찼는지 확인하려면 2번을 입력하세요:");
                        x = sc.nextInt();
                        if(x == 1) {
                            status = s.isEmpty();                           // isEmpty
                            if(status) {
                                System.out.println("비어있습니다.");
                            } else {
                                System.out.println("비어있지 않습니다.");
                            }
                            break;
                        } else if(x == 2) {
                            status = s.isFull();                            // isFull
                            if(status) {
                                System.out.println("가득차있습니다.");
                            } else {
                                System.out.println("가득차있지 않습니다.");
                            }
                            break;
                        } else {
                            System.out.println("1 or 2를 입력해주세요.");
                        }
                    }
            }
        }
    }
}
