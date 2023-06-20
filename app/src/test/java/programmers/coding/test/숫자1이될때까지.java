package programmers.coding.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * N과 K가 주어질 때, N이 1일 될때까지 1번 혹은 2번 과정을 수행해야 하는데 최소 횟수를 구하는 프로그램을 작성하시오.
 *
 * ## 자료
 * N이 1이 될 때까지 나눈다. N을 K로 나눈다. 결과는 최소 횟수
 *
 * ## 조건
 * N은 항상 K보다 크거나 같다. N이 1일 될때까지 반복한다.
 *
 * ## 계획
 * 1. N과 K의 수를 입력 받는다.
 * 2. N이 홀수 인 경우 1을 뺀다.
 * 3. N이 짝수가 되면 K로 나눈다.
 * 4. 횟수가 실행 될 때마다 result 에 1를 더한다.
 *
 * ## 반성
 * while문이 아니라고 재귀로 풀 수 있을 것 같다. 재귀 방식으로 풀어보는 방법을 고민해봐야겠다.
 *
 */
public class 숫자1이될때까지 {

  private int solution(int N, int K) {
    int result = 0;
    while (N >= K) {
      while (N % K != 0) {
        N -= 1;
        result += 1;
      }
      N /= K;
      result += 1;
    }

    return result;
  }

  @Test
  public void result() {
    assertThat(solution(17, 4)).isEqualTo(3);
    assertThat(solution(25, 5)).isEqualTo(2);
  }
}
