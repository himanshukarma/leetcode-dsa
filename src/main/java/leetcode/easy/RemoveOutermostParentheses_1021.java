package leetcode.easy;

public class RemoveOutermostParentheses_1021 {

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int bal = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (bal > 0)
                    res.append(c);
                bal++;
            } else {
                bal--;
                if (bal > 0)
                    res.append(c);
            }
        }
        return res.toString();
    }
}
