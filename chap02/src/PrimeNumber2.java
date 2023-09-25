public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;                // 나눈 횟수
        int ptr = 0;                    // 찾은 소수의 개수
        int[] prime = new int[500];     // 소수를 저장하는 배열

        prime[ptr++] = 2;   // 현재 ptr 변수가 가리키는 인덱스에 2를 저장하고 ptr을 1 증가시킴

        for(int n = 3; n <= 1000; n+=2) {       // 2는 소수이기 때문에 3부터 2씩 증가시켜 홀수만 생성
            int i;
            for(i = 1; i < ptr; i++) {          // 최초 실행시 ptr은 1이기 때문에 해당 반복문 실행안됨
                counter++;
                if(n % prime[i] == 0) {
                    break;
                }
            }
            if(ptr == i) {                      // 최초 실행시 ptr == i(1) true이기 때문에 prime[ptr++]에 n을 대입시킴
                prime[ptr++] = n;
            }
        }

        for(int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("나눗셈을 수행한 횟수: " + counter);
    }
}
