/*
 Day: 28
 Problem Name: Integer to Roman
 Topic: Arrays / Strings
 Platform: LeetCode
 Approach: Greedy Mapping
 Time Complexity: O(1)
 Space Complexity: O(1)
*/

public class Integer_to_Roman {

    // Converts an integer to its Roman numeral representation
    public static String intToRoman(int num) {

        // Predefined values and corresponding Roman symbols
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        // Greedily subtract the largest possible value
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
}
