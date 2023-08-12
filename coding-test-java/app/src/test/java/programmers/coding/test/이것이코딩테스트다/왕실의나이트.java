package programmers.coding.test.이것이코딩테스트다;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 8 X 8 좌표 평면상에서 나이트가 이동 할 수 있는 경우의 수를 구하라.
 *
 * ## 자료
 * - 왕실 정원
 *   >> 8 X 8 좌표 평면
 * - 왕실 정원 행의 위치
 *   >> 1 ~ 8 표현
 * - 왕실 정원 열의 위치
 *   >> a ~ h 표현
 *
 * ## 조건
 *  - 수평으로 두 칸 이동하면 수직으로 한 칸 이동
 *  - 수직으로 두 칸 이동하면 수평으로 한 칸 이동
 *
 * ## 계획
 *  1. 입력 받는 값을 숫자로 변환한다.
 *  2. 수직 수평을 이동하는 값을 수로 표현한다.
 *  3. 반복문을 통해서 정원의 크기만큼 탐색을 한다.
 *  4. 1보다 크거나 같고 8보다 작거나 같은 조건에 맞으면 경우의 수를 구한다.
 *
 * ## 반성
 * 상화좌우 문제로 유사하다. 그렇지만 어떻게 풀어야 할지는 머릿속에서 알고 있지만 구현을 어떻게 해야 할까가 문제였다.
 * 제일 어려웠던 점은 이동 경로를 어떻게 표현을 하는 것이였다.
 * 이런 유형의 문제를 계속해서 보면서 다시 문제를 보자마자 유형이 떠올릴수 있게 연습을 해야겟다.
 */
public class 왕실의나이트 {

    private int solution(String start) {
        int row = start.charAt(1) - '1';
        int colum = start.charAt(0) - 'a' + 1;

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        int result = 0;

        for (int i = 0; i < 8; i++) {
            int nextRow = row + dx[i];
            int nextColum = colum + dy[i];
            if (nextRow >= 1 && nextRow <= 8 && nextColum >= 1 && nextColum < 8) {
                result += 1;
            }
        }

        return result;
    }

    @Test
    public void result() {
        assertThat(solution("a1")).isEqualTo(2);
    }
}
