package programmers.sort.biggest_number;

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        int sum = 0;

        List<String> num_list = new ArrayList<>();
        for(int num: numbers) {
            num_list.add(String.valueOf(num));
            sum += num;
        }

        if(sum <= 0) return "0";

        num_list.sort((a,b) -> (b+a).compareTo(a+b));

        return String.join("",num_list);
    }
}
