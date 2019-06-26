import org.junit.Test;

public class PalindromeNumber {
    // palindrome   回文的

    @Test
    public void test() {
        System.out.println(isPalindrome(1234554321));

    }

    ///   my answer
    public boolean isPalindrome(int x) {
        int input = x;
        if (0 > input) {
            return false;
        }
        int result = 0;
        while (input != 0) {
            int remain = input % 10;
            result = result * 10 + remain;
            input = input / 10;
        }
        if (x != result)
            return false;
        return true;
    }

    /////     most votes answer
    public boolean isPalindrome2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }
}
