package programmers.dfsbfs.target_number;

import java.util.Arrays;

// 타겟 넘버 — 예제 입력으로 Solution 동작 검증
public class Main {
    public static void main(String[] args) {
        int[][] numbersCases = {
                {1, 1, 1, 1, 1},
                {4, 1, 2, 1},
        };
        int[] targets = {3, 4};
        int[] expected = {5, 2};

        int passed = 0;
        for (int i = 0; i < expected.length; i++) {
            // 프로그래머스처럼 테스트마다 새 인스턴스 사용 (필드 상태가 다음 테스트로 새지 않도록)
            int actual = new Solution().solution(numbersCases[i], targets[i]);
            boolean ok = expected[i] == actual;
            if (ok) passed++;
            System.out.printf("[%s] #%d numbers=%s target=%d -> expected=%d, actual=%d%n",
                    ok ? "PASS" : "FAIL", i + 1, Arrays.toString(numbersCases[i]), targets[i], expected[i], actual);
        }
        System.out.printf("%d/%d passed%n", passed, expected.length);
    }
}
