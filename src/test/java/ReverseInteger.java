import org.junit.Test;

public class ReverseInteger {
    @Test
    public void run() {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
//        System.out.println(Integer.MIN_VALUE);
        StringBuilder begin = new StringBuilder("123");
        System.out.println(begin.indexOf("-"));
        int input = 2147483647;
        int result = reverse2(1234567809);
        System.out.println(result);

    }

    /**
     * My answer
     * @param x
     * @return
     */
    public int reverse(int x) {
        if (x == 0)
            return 0;
        StringBuilder begin = new StringBuilder(x + "");
        StringBuilder end;
        String sym = "";
        if (begin.indexOf("-") != -1) {
            end = begin.delete(0, 1).reverse();
            sym = "-";
        } else {
            end = begin.reverse();
        }
        try {
            int result = Integer.valueOf(sym + end.toString());
            return result;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /**
     * Most votes answer on web
     * @param x
     * @return
     */
    public int reverse2(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }

        return result;
    }
}
