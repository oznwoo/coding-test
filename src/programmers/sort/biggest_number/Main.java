package programmers.sort.biggest_number;

import java.util.Arrays;

// 가장 큰 수 — 예제 입력으로 Solution 동작 검증 (#3은 경계 케이스용 추가 테스트)
public class Main {
    public static void main(String[] args) {
        int[][] numbersCases = {
                {6, 10, 2},
                {3, 30, 34, 5, 9},
                {0, 0, 0},
        };
        String[] expected = {"6210", "9534330", "0"};

        Solution solution = new Solution();
        int passed = 0;
        for (int i = 0; i < expected.length; i++) {
            String actual = solution.solution(numbersCases[i]);
            boolean ok = expected[i].equals(actual);
            if (ok) passed++;
            System.out.printf("[%s] #%d numbers=%s -> expected=%s, actual=%s%n",
                    ok ? "PASS" : "FAIL", i + 1, Arrays.toString(numbersCases[i]), expected[i], actual);
        }
        System.out.printf("%d/%d passed%n", passed, expected.length);
    }
}
