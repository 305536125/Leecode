import org.junit.Test;

public class RemoveDuplicates {

    @Test
    public void test() {
        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        System.out.println(input[0 - 1]);
        System.out.println(removeDuplicates(input));

    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i - 1])
                nums[i++] = n;
        return i;
    }
}
