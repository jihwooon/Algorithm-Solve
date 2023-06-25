package programmers.coding.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 너비우선탐색
 * ## 자료
 * 선입선출 방식인 큐 자료구조
 *
 * ## 조건
 *
 * ## 계획
 * 1. 탐색 시작 노드를 큐에 삽입하고 방문 처리는 한다.
 * 2. 큐에서 노드를 꺼내 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입한다.
 * 3. 위에 방식들을 반복한다.
 * ## 반성
 * BFS와 DFS의 구현 방식을 스스로 증명하고 구현할 수 있게 연습을 해야 겠다.
 */
public class bfs {

    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static boolean[] visited = new boolean[9];

    private void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);

        visited[x] = true;

        while (!queue.isEmpty()) {
            Integer y = queue.poll();
            System.out.print(y + " ");
            for (int i = 0; i < graph.get(y).size(); i++) {
                Integer z = graph.get(y).get(i);
                if (!visited[z]) {
                    queue.offer(z);
                    visited[z] = true;
                }
            }
        }
    }

    @Test
    public void result() {
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);

        bfs(1);
    }

}
