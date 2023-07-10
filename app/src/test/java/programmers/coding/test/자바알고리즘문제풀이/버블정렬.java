package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * N개 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하라.
 *
 * ## 자료
 * 오름차순
 *  >> 작은수부터 큰수까지 정렬
 *
 * ## 조건
 * 주어진 숫자를 버블 정렬로 오름차순해서 정렬하라.
 *
 * ## 계획
 * 1. 입력 받은 배열의 수를 입력 받는다.
 * 2. 배열을 탐색한다.
 * 3. for문을 사용하고 for문을 한번 더 사용해서 앞의 자리 수와 뒤에 자리 수를 비교한다.
 * 4. 앞의 수가 뒤의 수보다 크면 자리를 교환한다.
 * 5. 교환이 끝나면 결과값을 출력한다.
 *
 * ## 반성
 * 여기 문제도 또한 버블 정렬을 모르면 풀 수가 없다. 선택 정렬과 버블 정렬을 공부를 해야겠다.
 */

public class 버블정렬 {

    private int[] solution(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    @Test
    @DisplayName("입력 받은 수를 오름차순으로 정렬하라")
    public void result() {
        assertThat(solution(new int[]{13, 5, 11, 7, 23, 15})).isEqualTo(
            new int[]{5, 7, 11, 13, 15, 23});
    }

}
