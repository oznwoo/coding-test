package programmers.dfsbfs.word_conversion;

import java.util.*;

// 프로그래머스 43163 - 단어 변환
class Solution {

    private boolean isOneDiff(String a, String b) {
        int diff = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) diff ++;
        }
        return diff == 1;
    }

    public int solution(String begin, String target, String[] words) {

        // 1. 초기 변수 세팅
        Queue<String> q = new ArrayDeque<>(); // 다음에 갈 단어 Queue
        HashMap<String, Integer> hm = new HashMap<>(); // 각 단어별 최단 거리

        // 2. 초기값 세팅
        q.offer(begin);
        hm.put(begin, 0);

        // 3. 큐가 빌 때까지 반복
        while(!q.isEmpty()) {
            String cur = q.poll();

            // 4. words 배열에 있는 단어들에 대해 순회
            for(String word: words) {

                // 5. 알파벳의 차이가 1이 아닌 단어일 경우 패스
                if(!isOneDiff(cur, word))  continue;
                if(hm.containsKey(word)) continue;

                // 6. 방문 처리 + 큐에 넣기
                hm.put(word, hm.get(cur)+1);
                q.offer(word);
            }
        }

        return hm.getOrDefault(target, 0);
    }
}
