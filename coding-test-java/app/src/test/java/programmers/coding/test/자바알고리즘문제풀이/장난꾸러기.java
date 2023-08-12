package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때 철수가 받은 번호와 철수 짝꿍이 받은 번호를
 * 차례로 출력하는 프로그램을 작성하세요.
 * ## 자료
 * 키의 값
 * >> H는 (120 <= H <= 150)
 * 철수의 키
 * 짝꿍의 키
 *
 * ## 조건
 *
 * ## 계획
 * 1. 일렬로 서 있는 학생의 키를 입력 받습니다.
 * 2. 학생의 키의 배열을 복사합니다.
 * 3. 오름차순으로 정렬합니다.
 * 4. 기존의 배열과 복사한 배열을 비교해서 값이 다른 경우에 자리수를 배열에 담습니다.
 * 5. 결과를 반환합니다.
 *
 * ## 반성
 * 깊은 복사로 서로 비교해서 새로운 배열에 담는 방법은 이번에 처음 알았다.
 */
public class 장난꾸러기 {

    private ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    @Test
    public void result() {
        assertThat(solution(new int[]{120, 125, 152, 130, 135, 135, 143, 127, 160})).isEqualTo(
            Arrays.asList(3, 8));
    }

}
