package leetcode.easy;

public class RevverseDegreeOfAString_3498 {
    public static void main(String[] args) {
        System.out.println(reverseDegree("abc")); // Output: 14
        System.out.println(reverseDegree("def")); // Output: 26
    }

    public static int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int reverseValue = 26 - (c - 'a');
            int position = i + 1;

            sum += reverseValue * position;
        }
        return sum;
    }
}
