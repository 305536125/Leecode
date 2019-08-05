import org.junit.Test;

public class LongestCommonPrefix {
    @Test
    public void test() {
        String[] in = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(in));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String common = strs[0];
        for (String str : strs) {
            while (str.indexOf(common) != 0) {
                common = common.substring(0, common.length() - 1);
            }
        }
        return common;
    }
}
