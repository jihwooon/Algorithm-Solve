package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
 * 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.
 *
 * ## 자료
 * 임의의 N개의 수
 * 검색할 M의 수
 * 오름차순
 * 이분 검색
 *
 * ## 조건
 * 중복 값은 존재하지 않는다.
 *
 * ## 계획
 * 1. M의 수, 배열의 N의 수를 입력 받는다.
 * 2. 배열의 N을 오름 차순으로 정렬한다.
 * 3. 이분 검색으로 정렬 된 상태의 N의 수 중 M의 위치가 몇 번째 인지 찾는다.
 * 4. 결과값을 반환한다.
 *
 * ## 반성
 * 이분 탐색은 mid을 어떻게 설정하냐에 따라 위치가 달라진다. 찾아야 할 값의 위치가 mid보다 작거나 클 때 따라 위치를 변경해서 구하면 답을 쉽게 찾을 수 있다.
 */
public class 이분검색 {

    private int solution(int M, int... N) {
        int index = 0;
        int leftIndex = 0;
        int rightIndex = N.length - 1;
        Arrays.sort(N);

        while (leftIndex <= rightIndex) {
            int mid = (leftIndex + rightIndex) / 2;
            if (N[mid] == M) {
                index = mid + 1;
                break;
            }

            if (N[mid] > M) {
                rightIndex = mid - 1;
            } else {
                leftIndex = mid + 1;
            }
        }

        return index;
    }

    @Test
    public void result() {
        assertThat(solution(32, 23, 87, 65, 12, 57, 32, 99, 81)).isEqualTo(3);
    }
}
