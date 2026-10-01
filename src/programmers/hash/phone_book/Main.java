package programmers.hash.phone_book;

import java.util.Arrays;

// 전화번호 목록 — 예제 입력으로 Solution 동작 검증
public class Main {
    public static void main(String[] args) {
        String[][] phoneBooks = {
                {"119", "97674223", "1195524421"},
                {"123", "456", "789"},
                {"12", "123", "1235", "567", "88"},
        };
        boolean[] expected = {false, true, false};

        Solution solution = new Solution();
        int passed = 0;
        for (int i = 0; i < expected.length; i++) {
            boolean actual = solution.solution(phoneBooks[i]);
            boolean ok = expected[i] == actual;
            if (ok) passed++;
            System.out.printf("[%s] #%d %s -> expected=%b, actual=%b%n",
                    ok ? "PASS" : "FAIL", i + 1, Arrays.toString(phoneBooks[i]), expected[i], actual);
        }
        System.out.printf("%d/%d passed%n", passed, expected.length);
    }
}
