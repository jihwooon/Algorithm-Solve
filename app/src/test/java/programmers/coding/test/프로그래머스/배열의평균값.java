package programmers.coding.test.프로그래머스;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 정수 배열의 numbers의 원소의 평균값을 구하라
 *
 * ## 자료
 * 정수 배열
 * 평균값
 *
 * ## 조건
 * 결과값이 소수 부분을 표현한다.
 *
 * ## 계획
 * 1. 정수 배열의 전체 원소의 값의 합을 구한다.
 * 2. 원소의 합 값 / 배열의 길이
 * 3. 새로운 변수의 값을 반환한다.
 *
 * ## 반성
 * 평균값 구하는 문제이다. 연산문제라서 문제만 이해 할 수 있으면 풀 수 있다.
 * 자바 8의 함수형으로도 문제를 풀어 볼 수 있다.
 */

public class 배열의평균값 {

    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        answer = (double) sum / numbers.length;

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).isEqualTo(5.5);
    }

    public double solution1(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }

    @Test
    public void result1() {
        assertThat(solution1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).isEqualTo(5.5);
    }

}
