public class Max4 {

    public static void main(String[] args) {
        System.out.println("max4(10, 20, 30, 40) : " + max4(10, 20, 30, 40));
        System.out.println("min3(10, 20, 30) : " + min3(10, 20, 30));
        System.out.println("min4(10, 20, 30, 40) : " + min4(10, 20, 30, 40));
    }

    static int max4(int a, int b, int c, int d) {

        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }

    static int min3(int a, int b, int c) {

        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);

        int resultMin = Math.min(min1, min2);

        return resultMin;
    }
}
