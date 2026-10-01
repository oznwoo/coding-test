package programmers.hash.clothes;

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hm = new HashMap<>();

        for(String[] cloth: clothes) hm.put(cloth[1], hm.getOrDefault(cloth[1], 0) + 1);

        for(int num: hm.values()) {
            answer *= num + 1;
        }

        return answer-1;
    }
}
