package programmers.dfsbfs.word_conversion;

import java.util.Arrays;

// 단어 변환 — 예제 입력으로 Solution 동작 검증
public class Main {
    public static void main(String[] args) {
        String[] begins = {"hit", "hit"};
        String[] targets = {"cog", "cog"};
        String[][] wordsCases = {
                {"hot", "dot", "dog", "lot", "log", "cog"},
                {"hot", "dot", "dog", "lot", "log"},
        };
        int[] expected = {4, 0};

        int passed = 0;
        for (int i = 0; i < expected.length; i++) {
            // 프로그래머스처럼 테스트마다 새 인스턴스 사용 (필드 상태가 다음 테스트로 새지 않도록)
            int actual = new Solution().solution(begins[i], targets[i], wordsCases[i]);
            boolean ok = expected[i] == actual;
            if (ok) passed++;
            System.out.printf("[%s] #%d begin=%s, target=%s, words=%s -> expected=%d, actual=%d%n",
                    ok ? "PASS" : "FAIL", i + 1, begins[i], targets[i], Arrays.toString(wordsCases[i]),
                    expected[i], actual);
        }
        System.out.printf("%d/%d passed%n", passed, expected.length);
    }
}
