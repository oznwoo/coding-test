package programmers.hash.clothes;

import java.util.Arrays;

// 의상 — 예제 입력으로 Solution 동작 검증
public class Main {
    public static void main(String[] args) {
        String[][][] clothesCases = {
                {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}},
                {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}},
        };
        int[] expected = {5, 3};

        Solution solution = new Solution();
        int passed = 0;
        for (int i = 0; i < expected.length; i++) {
            int actual = solution.solution(clothesCases[i]);
            boolean ok = expected[i] == actual;
            if (ok) passed++;
            System.out.printf("[%s] #%d %s -> expected=%d, actual=%d%n",
                    ok ? "PASS" : "FAIL", i + 1, Arrays.deepToString(clothesCases[i]), expected[i], actual);
        }
        System.out.printf("%d/%d passed%n", passed, expected.length);
    }
}
