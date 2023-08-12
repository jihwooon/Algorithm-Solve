package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * N과 K가 주어질 때 공주를 구하러 갈 왕자의 번호를 출력하는 프로그램을 작성하시오
 *
 * ## 자료
 * N은 왕자
 * K은 특정 숫자을 외치면 그 숫자는 제외된다.
 *
 * ## 조건
 *
 * ## 계획
 * 1. N과 K의 숫자를 입력 받는다.
 * 2. Queue를 구현한다.
 * 3. for문을 이용해서 1 ~ 8의 숫자를 queue에 담는다.
 * 4. k만큼 for문을 탐색하고 앞에 있는 숫자를 뒤로 보낸다.
 * 5. 숫자를 꺼낸다.
 * 6. 위에 과정을 반복한다.
 * 7. queue의 크기가 1이 되면 answer 결과에 담는다.
 * 8. 결과값을 리턴한다.
 *
 * ## 반성
 * 이 문제를 보고서 Queue를 떠올려야 하는데 아직 그 힌트가 보이지 않는다. Queue와 Stack은 기초적인 컬렉션 데이터 타입이다.
 * 이를 잘 활용해서 DFS와 BFS가 나올 때까지 잘 익혀야겠다.
 */

public class 공주구하기 {

    private int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int j = 1; j < k; j++) {
                queue.offer(queue.poll());
            }
            queue.poll();

            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution(8, 3)).isEqualTo(7);
    }
}
