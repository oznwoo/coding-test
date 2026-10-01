package programmers.hash.ponkemon;

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> ps = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            ps.add(nums[i]);
        }

        if(ps.size() > nums.length / 2) answer = nums.length / 2;
        else answer = ps.size();

        return answer;
    }
}
