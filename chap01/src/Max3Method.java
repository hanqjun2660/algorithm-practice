public class Max3Method {

    public static void main(String[] args) {

        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(2,1,3) = " + max3(2,1,3));
        System.out.println("max3(1,3,2) = " + max3(1,3,2));
        System.out.println("max3(4,3,2) = " + max3(4,3,2));
        System.out.println("max3(3,5,1) = " + max3(3,5,1));
        System.out.println("max3(3,1,4) = " + max3(3,1,4));
        System.out.println("max3(2,7,1) = " + max3(2,7,1));
        System.out.println("max3(2,4,1) = " + max3(2,4,1));
        System.out.println("max3(9,3,2) = " + max3(9,3,2));
        System.out.println("max3(3,2,7) = " + max3(3,2,7));
        System.out.println("max3(2,3,1) = " + max3(2,3,1));

    }

    /**
     *
     * @param a 입력받은 정수
     * @param b
     * @param c
     * @return 최대값 정수 return
     */
    static int max3(int a, int b, int c) {

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        return max;
    }
}
