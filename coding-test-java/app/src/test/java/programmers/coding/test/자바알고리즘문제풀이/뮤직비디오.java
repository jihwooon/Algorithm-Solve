package programmers.coding.test.자바알고리즘문제풀이;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * DVD의 최소 용량 크기를 출력하세요.
 * ## 자료
 * M은 DVD의 동영상
 * 결과값은 DVD의 최소 용량
 *
 * ## 조건
 * 가장 최소값과 가장 최대값을 구한다.
 *
 * ## 계획
 *
 * ## 반성
 *
 */
public class 뮤직비디오 {

    private int solution(int M, int... size) {
        int answer = 0;

        int left = Arrays.stream(size).max().getAsInt();
        int right = Arrays.stream(size).sum();

        while (left < right) {
            int mid = (left + right) / 2;
            if (count(size, mid) <= M) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    private int count(int[] size, int capacity) {
        int cnt = 1;
        int sum = 0;
        for (int x : size) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }

        return cnt;
    }

    @Test
    public void result() {
        assertThat(solution(3, 1, 2, 3, 4, 5, 6, 7, 8, 9)).isEqualTo(17);
    }

}
