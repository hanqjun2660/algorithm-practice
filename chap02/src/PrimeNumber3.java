public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;                // 곱셈과 나눗셈한 횟수
        int ptr = 0;                    // 구한 소수의 갯수
        int[] prime = new int[500];     // 소수를 저장할 배열

        prime[ptr++] = 2;               // 0번 인덱스에 2저장하고 ptr변수 1증가
        prime[ptr++] = 3;               // 1번 인덱스에 3저장하고 ptr변수 1증가 -> ptr = 2인상태
        
        for(int n = 5; n <= 1000; n += 2) {     // 5부터 홀수만 조사
            boolean flag = false;
            for(int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;                   // 곱셈과 나눗셈을 한 횟수를 저장하기 위해 2씩 카운트 했다.
                if(n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {                 // 안쪽 for문이 실행되지 않으면 (prime[i] * prime[i] <= n) 연산이 수행횟수에 포함되지 않아 별도의 flag를 생성하여 안쪽 for문 바깥에서 카운트를 1 해준다.
                prime[ptr++] = n;
                counter++;
            }
        }

        for(int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }
}
