package programmers.coding.test;

import java.util.Scanner;

/**
 * ## 미지의 것
 * 한 번에 만들 수 있는 아이스크림의 개수를 출력하라
 *
 * ## 자료
 * 얼음 틀
 * >> 세로 길이 N, 가로 길이 M
 * 구멍이 뚫려있는 부분 0, 그렇지 않은 부분 1
 * 구멍이 뚫려 있는 부분 상,하, 좌, 우 이동
 *
 * ## 조건
 * 0인 경우 지나갈 수 있다. 1인 경우에는 못 지나간다.
 *
 * ## 계획
 * 1. N과 M의 값을 입력한다.
 * 2. 이중 배열을 이용해서 N X M의 배열을 만든다.
 * 3. 얼음틀에 0과 1로 된 예시를 문자로 입력 받는다.
 * 4. 주어진 문자열을 탐색 했을 때 0인 인 경우 1로 표시 한다.
 * 5. DFS 안에서 재귀함수로 해서 0이 경우를 계속해서 탐색 한 다음 0에 해당한 부분이 완전히 1이 된 경우 빠져나와서 갯수를 세준다.
 * 6. 위에 방법대로 반복 해서 전체의 반복된 횟수를 구한다.
 * ## 반성
 * DFS 문제라고 하지만 도저히 어디에서 DFS라는 것 단번에 알 수 있는지 모르겠다. 문제가 요구하는 바를 한번에 알기 위해서는 해당 문제를 이해하고 떠올릴 수 있어야 된다.
 * 테스트 코드로 작성하려고 했는데 테스트 코드로는 작성이 어려웠다. 작게 쪼개서 다시 시도해봐야겠다.
 */
public class 음료수얼려먹기 {

    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    // DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문
    public static boolean dfs(int x, int y) {
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x <= -1 || x >=n || y <= -1 || y >= m) {
            return false;
        }
        // 현재 노드를 아직 방문하지 않았다면
        if (graph[x][y] == 0) {
            // 해당 노드 방문 처리
            graph[x][y] = 1;
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // 모든 노드(위치)에 대하여 음료수 채우기
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 현재 위치에서 DFS 수행
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
        System.out.println(result); // 정답 출력
    }
}
