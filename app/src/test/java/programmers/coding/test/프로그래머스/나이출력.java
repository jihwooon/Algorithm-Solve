package programmers.coding.test.프로그래머스;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 *  나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요
 *
 * ## 자료
 * 나이
 * 2022년을 기준 출생 연도
 *
 * ## 조건
 * 2022년 기준 40살이면 1983년생 입니다.
 * 2022년 기준 23살이면 2000년생 입니다.
 * 나이 제한은 0 < age ≤ 120 입니다.
 *
 * ## 계획
 * 1. 나이 age를 입력을 받는다.
 * 2. 나이의 조건은 0살 부터 120살 까지가 범위이다.
 * 3. 2022년 기준으로 나이 + 1 값을 뺀 결과값을 반환한다.
 * ## 반성
 * 단순 연산작업 문제이다. 미지의 것을 잘 읽으면 문제를 쉽게 풀 수 있다.
 */

public class 나이출력 {

    private int solution(int age) {
        int answer = 0;
        if (0 < age && age <= 120) {
            answer = 2022 - age + 1;
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution(23)).isEqualTo(2000);
        assertThat(solution(40)).isEqualTo(1983);
    }

}
