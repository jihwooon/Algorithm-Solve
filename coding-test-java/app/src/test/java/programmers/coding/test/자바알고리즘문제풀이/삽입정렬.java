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
 * 주어진 숫자를 오름차순으로 정렬하라.
 *
 * ## 계획
 * 1. 인덱스 1부터 시작해서 전체 배열을 순회하는 루프를 시작한다.
 * 2. 매 루프마다 tmp 변수에 저장한다.
 * 3. 다음으로 i - 1 부터 0까지 감소하는 루프를 시작한다.
 * 4. arr[i] 값이 tmp보다 큰 지 확인한다.
 * 5. 크다면 왼쪽 값을 오른쪽으로 시프트한다.
 * 6. 그렇지 않으면 루프를 끝낸다.
 * 7. 루프 마지막 단계에서 tmp를 공백에 삽입한다.
 * 8. 모든 루프가 끝나면 정렬된 배열을 반환한다.
 *
 * ## 반성
 * 삽입 정렬은 루프가 돌면서 임시 저장을 하고 역으로 큰거나 작거나 비교해서 공백에 넣는 형태이다.
 * 삽입 정렬, 선택 정렬, 버블 정렬은 기본 정렬이라서 공부를 해야겠다.
 *
 */

public class 삽입정렬 {

    private int[] solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    @Test
    @DisplayName("전제 배열을 정렬하라")
    public void result() {
        assertThat(solution(new int[]{13, 5, 11, 7, 23, 15})).isEqualTo(
            new int[]{5, 7, 11, 13, 15, 23});
    }

    private int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && compare(arr[j], arr[j - 1]); j--) {
                swap(arr, j, j - 1);
            }
        }
        return arr;
    }

    @Test
    @DisplayName("compare메서드를 사용해서 전체 배열을 정렬하라")
    public void result1() {
        assertThat(insertSort(new int[]{13, 5, 11, 7, 23, 15})).isEqualTo(
            new int[]{5, 7, 11, 13, 15, 23});
    }

    private boolean compare(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
