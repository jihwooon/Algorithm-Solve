package programmers.coding.test.이것이코딩테스트다;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K가 주어질 때 동빈이의 큰 수의 법칙에 따른 결과를 출력하시오
 * ## 자료
 * 배열의 크기 N
 * 더해지는 횟수 M
 *
 * ## 조건
 * K가 M보다 작거나 같아야 한다.
 *
 * ## 계획
 * 배열안에 숫자는 큰 수부터 작은 수로 정렬한다.
 * 정렬된 배열에서 가장 큰 수와 두번째 큰 수를 가져온다.
 * 더해지는 숫자 M 이 0이 아니면 반복문을 통해서 더한다.
 * result에 first와 second값을 더해서 총 더해진 값을 마지막에 출력한다.
 *
 * ## 반성
 * 배열을 오름차순으로 정렬하는 방법은 알지만 내림차순으로 정렬하는 방법은 잘 모르겠다.
 * 왜냐하면 자바에는 내림차순으로 정렬하는 방법이 없었다.
 * 그래서 생각해낸게 n.length - 1/2를 통해서 내가 제일 큰 수가 마지막에 있는 것을 골라냈다.
 *
 */

class 큰수의법칙 {

  int solution(int m, int k, int... n) {
    int result = 0;
    Arrays.sort(n);

    int first = n[n.length - 1];
    int second = n[n.length - 2];

    while (m != 0) {
      for (int i = 0; i < k; i++) {
        result += first;
        m--;
      }
      result += second;
      m--;
    }

    return result;
  }

  @Test
  void result() {
    assertThat(solution(8, 3, 2, 4, 5, 4, 6)).isEqualTo(46);
  }
}
