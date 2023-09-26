public class YMD {

    int y;
    int m;
    int d;

    static int[][] mdays = {
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},       // 평년
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}        // 윤년
    };

    // 윤년인지 확인(윤년 : 1 / 평년 : 0)
    public static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    public YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public YMD after(int n){
        YMD temp = new YMD(this.y, this.m, this.d);

        if(n < 0) {
            return before(-n);      // -n을 하면 n의 절대값(양수)로 변환됨
        }

        temp.d += n;

        while(temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {     // 입력받은 날짜가 해당월의 일수를 초과하는지
            temp.d -= mdays[isLeap(temp.y)][temp.m];
            if(++temp.m > 12) {
                temp.y++;
                temp.m = 1;
            }
        }

        return temp;
    }

    public YMD before(int n){
        YMD temp = new YMD(this.y, this.m, this.d - n);

        if(n < 0) {
            return after(-n);       // -n을 하면 n의 절대값(양수)로 변환됨
        }

        temp.d -= n;

        while(temp.d < 1) {
            if(--temp.m < 1) {
                temp.y--;
                temp.m = 12;
            }
            temp.d += mdays[isLeap(temp.y)][temp.m - 1];
        }

        return temp;
    }
}
