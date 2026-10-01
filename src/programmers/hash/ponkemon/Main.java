package programmers.hash.ponkemon;

import java.util.Arrays;

// 폰켓몬 — 예제 입력으로 Solution 동작 검증
public class Main {
    public static void main(String[] args) {
        int[][] numsCases = {
                {3, 1, 2, 3},
                {3, 3, 3, 2, 2, 4},
                {3, 3, 3, 2, 2, 2},
        };
        int[] expected = {2, 3, 2};

        Solution solution = new Solution();
        int passed = 0;
        for (int i = 0; i < expected.length; i++) {
            int actual = solution.solution(numsCases[i]);
            boolean ok = expected[i] == actual;
            if (ok) passed++;
            System.out.printf("[%s] #%d %s -> expected=%d, actual=%d%n",
                    ok ? "PASS" : "FAIL", i + 1, Arrays.toString(numsCases[i]), expected[i], actual);
        }
        System.out.printf("%d/%d passed%n", passed, expected.length);
    }
}
