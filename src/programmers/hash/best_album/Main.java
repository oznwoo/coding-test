package programmers.hash.best_album;

import java.util.Arrays;

// 베스트앨범 — 예제 입력으로 Solution 동작 검증 (#2, #3은 경계 케이스용 추가 테스트)
public class Main {
    public static void main(String[] args) {
        String[][] genresCases = {
                {"classic", "pop", "classic", "classic", "pop"},
                {"a", "b", "a"},
                {"jazz"},
        };
        int[][] playsCases = {
                {500, 600, 150, 800, 2500},
                {100, 500, 100},
                {10},
        };
        int[][] expected = {
                {4, 1, 3, 0},
                {1, 0, 2},
                {0},
        };

        Solution solution = new Solution();
        int passed = 0;
        for (int i = 0; i < expected.length; i++) {
            int[] actual = solution.solution(genresCases[i], playsCases[i]);
            boolean ok = Arrays.equals(expected[i], actual);
            if (ok) passed++;
            System.out.printf("[%s] #%d genres=%s plays=%s -> expected=%s, actual=%s%n",
                    ok ? "PASS" : "FAIL", i + 1, Arrays.toString(genresCases[i]), Arrays.toString(playsCases[i]),
                    Arrays.toString(expected[i]), Arrays.toString(actual));
        }
        System.out.printf("%d/%d passed%n", passed, expected.length);
    }
}
