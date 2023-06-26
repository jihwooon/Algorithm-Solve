package programmers.coding.test;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * ## 미지의 것
 * 동빈나가 탈출하기 위해 움직여야 하는 최소 칸의 개수를 구하시오
 *
 * ## 자료
 * N X M 크기의 직사각형 형태의 미로
 * 괴물이 있는 부분은 0, 괴물이 없는 부분은 1
 * 처음 시작 위치 (1,1)
 *
 * ## 조건
 * N, M은 (4 <= N, M <= 200)
 * 시작과 마지막 칸은 항상 1이다.
 *
 * ## 계획
 * 1. N, M을 공백을 기준으로 구분하여 입력 받기
 * 2. 2차원 리스트의 맵 정보 입력 받기
 * 3. BFS를 수행한 결과 출력
 *
 * ## 반성
 * BFS를 알기 전에 Queue의 개념을 제대로 모르고 있었다. 자료구조 스택과 큐를 모르면 이 문제를 풀 수가 없을 것 같다.
 * Queue를 공부목록에 올려서 공부 한 다음 해당 관련된 문제를 많이 풀어봐야겠다.
 *
 */

class Node {

    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class 미로탈출 {

    public static int n, m;
    public static int[][] graph = new int[201][201];

    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                if (graph[nx][ny] == 0) {
                    continue;
                }

                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    queue.offer(new Node(nx, ny));
                }
            }
        }
        return graph[n - 1][m - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0));
    }

}
