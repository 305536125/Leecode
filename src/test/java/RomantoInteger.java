import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    @Test
    public void test() {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        char[] romanNumber = s.toCharArray();
        for (int i = 0; i < romanNumber.length; i++) {
            if (i != romanNumber.length - 1 && romanMap.get(romanNumber[i]) < romanMap.get(romanNumber[i + 1])) {
                result += romanMap.get(romanNumber[i + 1]) - romanMap.get(romanNumber[i]);
                i++;
            } else {
                result += romanMap.get(romanNumber[i]);
            }
        }
        return result;
    }
}

