package programmers.hash.best_album;

import java.util.*;

// 베스트앨범 — 장르별 총 재생 수 순으로, 장르마다 재생 수 상위 2곡의 고유번호를 수록
class Solution {
    private static final int MAX_SONGS_PER_GENRE = 2;

    public int[] solution(String[] genres, int[] plays) {
        // 1. 장르별로 노래 고유번호 묶기 + 장르별 총 재생 수 누적
        Map<String, List<Integer>> songsByGenre = new HashMap<>();
        Map<String, Integer> totalPlaysByGenre = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (!songsByGenre.containsKey(genres[i])) {
                songsByGenre.put(genres[i], new ArrayList<>());
            }
            songsByGenre.get(genres[i]).add(i);
            totalPlaysByGenre.put(genres[i], totalPlaysByGenre.getOrDefault(genres[i], 0) + plays[i]);
        }

        // 2. 장르를 총 재생 수 내림차순으로 정렬 (HashMap은 순서가 없으므로 리스트로 옮겨서 정렬)
        List<String> genreOrder = new ArrayList<>(songsByGenre.keySet());
        genreOrder.sort((a, b) -> totalPlaysByGenre.get(b) - totalPlaysByGenre.get(a));

        // 3. 장르 순서대로, 장르 안의 노래를 정렬한 뒤 최대 2곡씩 수록
        List<Integer> album = new ArrayList<>();
        for (String genre : genreOrder) {
            List<Integer> songs = songsByGenre.get(genre);

            // 재생 수 내림차순, 재생 수가 같으면 고유번호 오름차순
            songs.sort((a, b) -> plays[a] != plays[b] ? plays[b] - plays[a] : a - b);

            // 곡이 1개뿐인 장르도 있으므로 size와 2 중 작은 값까지만
            for (int i = 0; i < Math.min(MAX_SONGS_PER_GENRE, songs.size()); i++) {
                album.add(songs.get(i));
            }
        }

        // 4. List<Integer> → int[] 변환
        return album.stream().mapToInt(Integer::intValue).toArray();
    }
}
