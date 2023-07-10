package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
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
 * 주어진 숫자를 오름차순으로 정렬하라.
 *
 * ## 계획
 * 1. int 배열의 arr의 수를 입력받는다.
 * 2. 새로운 배열을 생성한다.
 * 3. 0 부터 배열의 크기를 반복해서 새로운 배열에 수를 추가한다.
 * 4. 오름차순으로 정렬한다.
 * 5. 결과을 출력한다.
 *
 * ## 반성
 * 입력 받은 숫자를 오름차순으로 정렬하는 것은 쉽다.
 * 선택 정렬을 통해서 변경하려고 하는데 선택 정렬이 어떻게 되는지를 몰라서 이 문제를 선택 정렬로 풀지 못 했다.
 */

public class 선택정렬 {

    private int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        Arrays.sort(answer);

        return answer;
    }

    @Test
    @DisplayName("배열을 오름차순으로 정렬하라")
    public void result() {
        assertThat(solution(new int[]{13, 5, 11, 7, 23, 15})).isEqualTo(
            new int[]{5, 7, 11, 13, 15, 23});
    }

    private int[] solution1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }

                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }
        }
        return arr;
    }

    @Test
    @DisplayName("선택 정렬으로 오름차순으로 정렬하라")
    public void result1() {
        assertThat(solution1(new int[]{13, 5, 11, 7, 23, 15})).isEqualTo(
            new int[]{5, 7, 11, 13, 15, 23});
    }

}
