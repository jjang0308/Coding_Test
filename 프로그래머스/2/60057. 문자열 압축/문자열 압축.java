public class Solution {
    public int solution(String s) {
        int minLength = s.length();

        for (int unit = 1; unit <= s.length() / 2; unit++) {
            StringBuilder sb = new StringBuilder();
            String prev = "";
            int count = 1;
            for (int i = 0; i < s.length(); i += unit) {
                String current;
                if (i + unit <= s.length()) {
                    current = s.substring(i, i + unit);
                } else {
                    current = s.substring(i);
                }

                if (current.equals(prev)) {
                    count++;
                } else {
                    if (!prev.isEmpty()) {
                        sb.append(count > 1 ? count : "").append(prev);
                    }
                    prev = current;
                    count = 1;
                }
            }
            if (!prev.isEmpty()) {
                sb.append(count > 1 ? count : "").append(prev);
            }
            minLength = Math.min(minLength, sb.length());
        }
        return minLength;
    }
}
