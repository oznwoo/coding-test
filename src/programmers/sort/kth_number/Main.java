package programmers.sort.kth_number;

import java.util.Arrays;

// K번째수 — 예제 입력으로 Solution 동작 검증
public class Main {
    public static void main(String[] args) {
        int[][] arrayCases = {
                {1, 5, 2, 6, 3, 7, 4},
        };
        int[][][] commandsCases = {
                {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}},
        };
        int[][] expected = {
                {5, 6, 3},
        };

        Solution solution = new Solution();
        int passed = 0;
        for (int i = 0; i < expected.length; i++) {
            int[] actual = solution.solution(arrayCases[i], commandsCases[i]);
            boolean ok = Arrays.equals(expected[i], actual);
            if (ok) passed++;
            System.out.printf("[%s] #%d array=%s commands=%s -> expected=%s, actual=%s%n",
                    ok ? "PASS" : "FAIL", i + 1, Arrays.toString(arrayCases[i]),
                    Arrays.deepToString(commandsCases[i]), Arrays.toString(expected[i]), Arrays.toString(actual));
        }
        System.out.printf("%d/%d passed%n", passed, expected.length);
    }
}
