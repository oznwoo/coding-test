package programmers.hash.incomplete_runner;

import java.util.Arrays;

// 완주하지 못한 선수 — 예제 입력으로 Solution 동작 검증
public class Main {
    public static void main(String[] args) {
        String[][] participants = {
                {"leo", "kiki", "eden"},
                {"marina", "josipa", "nikola", "vinko", "filipa"},
                {"mislav", "stanko", "mislav", "ana"},
        };
        String[][] completions = {
                {"eden", "kiki"},
                {"josipa", "filipa", "marina", "nikola"},
                {"stanko", "ana", "mislav"},
        };
        String[] expected = {"leo", "vinko", "mislav"};

        Solution solution = new Solution();
        int passed = 0;
        for (int i = 0; i < expected.length; i++) {
            String actual = solution.solution(participants[i], completions[i]);
            boolean ok = expected[i].equals(actual);
            if (ok) passed++;
            System.out.printf("[%s] #%d %s -> expected=%s, actual=%s%n",
                    ok ? "PASS" : "FAIL", i + 1, Arrays.toString(participants[i]), expected[i], actual);
        }
        System.out.printf("%d/%d passed%n", passed, expected.length);
    }
}
