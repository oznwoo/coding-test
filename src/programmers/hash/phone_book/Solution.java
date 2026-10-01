package programmers.hash.phone_book;

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashSet<String> hs = new HashSet<>();

        for(String phone_num: phone_book) hs.add(phone_num);

        for(String phone_num: phone_book) {
            for(int i = 0; i < phone_num.length(); i++){
                if(hs.contains(phone_num.substring(0,i))) return false;
            }
        }

        return answer;
    }
}
