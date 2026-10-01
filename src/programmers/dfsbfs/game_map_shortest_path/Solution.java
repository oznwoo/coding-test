package programmers.dfsbfs.game_map_shortest_path;

import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length, m = maps[0].length;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int[][] dist = new int[n][m];
        Queue<int[]> q = new ArrayDeque<>();

        // 1. 시작점: 큐에 넣고 거리 기록
        q.offer(new int[]{0,0});
        dist[0][0] = 1;

        // 2. 큐가 빌 때까지 반복
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c= cur[1];

            // 3. 상하좌우 4방향
            for (int d = 0; d < 4; d++){
                int nr = r + dr[d];
                int nc = c + dc[d];

                // 4. 못 가는 칸 거르기 (순서 중요: 범위 검사가 먼저 !)
                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (maps[nr][nc] <= 0) continue;
                if (dist[nr][nc] > 0) continue;

                // 5. 방문 처리 + 큐에 넣기
                dist[nr][nc] = dist[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }
        // 6. 도착점 확인
        return dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];
    }
}
