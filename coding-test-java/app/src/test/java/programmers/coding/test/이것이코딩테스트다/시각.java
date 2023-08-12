package programmers.coding.test.이것이코딩테스트다;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 모든 시각 중 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하시오.
 * ## 자료
 * 시각
 * >> 24시 60분 60초
 * 경우의 수
 * >> 갯수 세기
 * ## 조건
 * 정수 N은 0 <= N <= 23 범위의 수다.
 * 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중 3이 하나라도 포함이 되는 모든 경우의 수를 구한다.
 *
 * ## 계획
 * 1. N(시)을 입력 받는다.
 * 2. 3중 for문으로 탐색을 한다.
 * 3. 3이 포함이 되어 있는지 체크를 합니다.
 * 4. 3이 있는 것만 count를 셉니다.
 * ## 반성
 * 처음 보자마자 풀이를 떠 올리기가 쉽지 않다. 알고리즘 문제를 풀지만 풀이가 생각이 안나면 한참 생각을 해야 한다.
 * 이 문제에서 얻은 for문으로 탐색을 해서 조건에 맞는 것만 센다는 것이다.
 * 단순하면서도 이 방식을 많이 사용하기도 한다.
 * 리팩터링을 한번 시도해봐야겠다.
 *
 */
public class 시각 {
    private int solution(int N) {
        int count = 0;
        for(int i = 0; i <= N; i++) {
            for(int j = 0; j < 60; j++) {
                for(int k = 0; k < 60; k++) {
                    if(isCheck(i, j, k)) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }

    public static boolean isCheck(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }

    @Test
    public void result() {
        assertThat(solution(5)).isEqualTo(11475);
    }
}
