package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 문자와 숫자가 섞여있는 문자열이 주어지면, 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 *
 * ## 자료
 * 문자열
 * 자연수
 *
 * ## 조건
 * 문자열 사이에 존재하는 숫자를 추출하라
 *
 * ## 계획
 * 1. 입력받는 문자열을 맏는다.
 * 2. 문자열을 반복문으로 순회하여 char롤 변환한다.
 * 3. char 중 48 과 57 이하의 숫자의 조건을 만든다.
 * 4. * 10과 char - 48를 뺀 결과값을 반환한다.
 *
 * ## 반성
 * char의 아스키코드를 잘 알아야 한다. 그리고 숫자 자릿수 더하기를 알아야한다.
 *
 */
public class 숫자만추출 {

    private int solution(String str) {
        int answer = 0;

        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution("g0en2T0s8eSoft")).isEqualTo(208);
    }


}
