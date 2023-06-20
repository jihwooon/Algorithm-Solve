package programmers.coding.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 계획서가 주어졌을 때 여행가 A가 최종적으로 도착할 지점의 좌표를 출력하는 프로그램을 작성하시오.
 * ## 자료
 * 계획서
 * >> 이동할 계획
 * 정사각형
 * >> N x N의 정사격형
 * ## 조건
 * 공간의 크기를 나타내는 N이 주어진다.
 * 여행가 A가 이동할 계획서 내용이 주어진다.
 *
 * ## 계획
 * 1.
 *
 * ## 반성
 * 상하좌우 이동은 아직도 개념을 이해가 안 간다. 코딩을 거의 암기식으로 하다보니 뭔가를 떠올리고 이걸 코드화 시키는 것이 어렵다.
 * 왜 어려울까? 익숙하지 않아서 일까? 아니면 아직 논리적인 사고가 부족해서 일까?
 */
public class 상하좌우 {

    private int[] solution(int N, String... plans) {
        int x = 1;
        int y = 1;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] move_type = {'L', 'R', 'U', 'D'};

        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);

            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == move_type[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }

            if (nx < 1 || ny < 1 || nx > N || ny > N) {
                continue;
            }
            x = nx;
            y = ny;
        }

        return new int[]{x, y};
    }

    @Test
    public void result() {
        assertThat(solution(5, "R", "R", "R", "U", "D", "D")).isEqualTo(new int[]{3, 4});
    }
}
