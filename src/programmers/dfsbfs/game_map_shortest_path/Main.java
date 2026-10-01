package programmers.dfsbfs.game_map_shortest_path;

import java.util.Arrays;

// 게임 맵 최단거리 — 예제 입력으로 Solution 동작 검증
public class Main {
    public static void main(String[] args) {
        int[][][] mapsCases = {
                {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}},
                {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}},
        };
        int[] expected = {11, -1};

        int passed = 0;
        for (int i = 0; i < expected.length; i++) {
            // 프로그래머스처럼 테스트마다 새 인스턴스 사용 (필드 상태가 다음 테스트로 새지 않도록)
            int actual = new Solution().solution(mapsCases[i]);
            boolean ok = expected[i] == actual;
            if (ok) passed++;
            System.out.printf("[%s] #%d maps=%s -> expected=%d, actual=%d%n",
                    ok ? "PASS" : "FAIL", i + 1, Arrays.deepToString(mapsCases[i]), expected[i], actual);
        }
        System.out.printf("%d/%d passed%n", passed, expected.length);
    }
}
