package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 캐시의 크기가 주어지고, 캐시가 비어있는 상태에서 N개의 작업을 CPU가 차례로 처리한다면 N개의 작업을 처리한 후
 * 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례대로 출력하는 프로그램을 작성하세요
 *
 * ## 자료
 * 캐시의 크기
 * CPU
 * 캐시 메모리 상태
 * LRU
 *  >> 가장 최근에 사용되지 않은 것
 *  >> 캐시에서 작업을 제거할 때 가장 오랫동안 사용되지 않은 것을 제거
 *
 * ## 조건
 * 캐시 메모리의 상태를 가장 최근에 사용된 작업부터 출력하라
 *
 * ## 계획
 *
 * ## 반성
 * 이 문제는 문제를 제대로 이해하지 못하면 풀 수 없는 문제이다. 요구사항을 제대로 이해하고 디시 풀어봐야겠다.
 */
public class LRU {

    private int[] solution(int n, int... arr) {
        int[] cache = new int[n];

        for (int x : arr) {
            int position = -1;
            for (int i = 0; i < n; i++) {
                if (x == cache[i]) {
                    position = i;
                }
            }
            if (position == -1) {
                for (int i = n - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = position; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }

        return cache;
    }

    @Test
    public void result() {
        assertThat(solution(5, new int[]{1, 2, 3, 2, 6, 2, 3, 5, 7})).isEqualTo(
            new int[]{7, 5, 3, 2, 6});
    }

}
