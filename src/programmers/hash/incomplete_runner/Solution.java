package programmers.hash.incomplete_runner;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        StringBuilder answer = new StringBuilder();

        // 참가자 이름과 명수를 저장하는 HashMap 선언
        Map<String, Integer> part = new HashMap<>();

        // 참가자 배열에 대해 같은 이름의 참가자가 몇 명인지 계산
        for (String person : participant) {
            part.put(person, part.getOrDefault(person, 0) + 1);
        }

        // 완주자들 확인
        for (String person : completion) {
            if(part.containsKey(person)) {
                int temp = part.getOrDefault(person, 0);
                part.put(person, temp - 1);
            }
        }

        for (Map.Entry<String, Integer> e : part.entrySet()) {
            String key = e.getKey();
            int value = e.getValue();
            while(value > 0) {
                answer.append(key);
                value--;
            }
        }


        return answer.toString();
    }
}
