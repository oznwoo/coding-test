package programmers.sort.kth_number;

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();

        for(int[] command: commands) {
            List<Integer> temp = new ArrayList<>();
            for(int i = command[0]-1; i < command[1]; i++) temp.add(array[i]);
            temp.sort((a,b) -> a - b);
            answer.add(temp.get(command[2]-1));
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
