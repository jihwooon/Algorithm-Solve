package programmers.coding.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * N과 K가 주어질 때, N이 1일 될때까지 1번 혹은 2번 과정을 수행해야 하는데 최소 횟수를 구하는 프로그램을 작성하시오.
 *
 * ## 자료
 * N이 1이 될 때까지 나눈다.
 * N을 K로 나눈다.
 * 결과는 최소 횟수
 *
 * ## 조건
 * N은 항상 K보다 크거나 같다.
 * N이 1일 될때까지 반복한다.
 *
 * ## 계획
 * 1. N < K 보다 작으면 Base Case 0으로 한다.
 * 2. N % K == 0 이면 재귀 함수를 N / K로 한다.
 * 3. 만약 그렇지 않으면 N - 1로 재귀함수를 한다.
 * 4. 결과를 반환한다.
 *
 * ## 반성
 * 재귀 함수를 바꿀 때 BaseCase를 N == 1로 정해놓고 풀었다. 그리고 나서 결과 값을 0으로 정해놓고
 * 재귀로 풀 수 있게 변환 해놓고 했다.
 * 그런데 ChatGPT에 물어봤을 때 의외로 쉽게 풀이를 제시했다.
 * 내 풀이를 보고 나니 비효율적인 코드를 많이 작성했다.
 *
 * 나는 N >= K라 생각 하고 풀었는데 오히려 이것이 낭비요소를 많이 만드는 것 같다. BaseCase를 주어진 조건에 반대로 하면 손쉽게 풀 수 있다는 것을
 * 이번게 알게 되었다. 다음부터는 주어진 조건을 반대로 생각해서 줄일 수 있는 방법을 떠올려야겠다.
 */
public class 숫자1이될때까지 {

  // GPT 풀이
  private int solution(int N, int K) {
    if (N < K) {
      return 0;
    } else if (N % K == 0) {
      return 1 + solution(N / K, K);
    } else {
      return 1 + solution(N - 1, K);
    }
  }

  // 내 풀이
  private int solution2(int N, int K) {
    int result = 0;
    if (N == 1) {
      return result;
    }

    if (N >= K) {
      if (N % K != 0) {
        result = 1 + solution2(N - 1, K);
      } else {
        result = 1 + solution2(N / K, K);
      }
    }
    return result;
  }

  @Test
  public void result() {
    assertThat(solution(25, 5)).isEqualTo(2);
    assertThat(solution(17, 4)).isEqualTo(3);
    assertThat(solution(18, 2)).isEqualTo(5);
    assertThat(solution(16, 4)).isEqualTo(2);
  }

  @Test
  public void result2() {
    assertThat(solution2(25, 5)).isEqualTo(2);
    assertThat(solution2(17, 4)).isEqualTo(3);
    assertThat(solution2(18, 2)).isEqualTo(5);
    assertThat(solution2(16, 4)).isEqualTo(2);
  }
}
