package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 *
 *  ## 자료
 *  가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보
 *  N은 횟수
 *
 * ## 조건
 * 각 회의 승자를 출력한다.
 *
 * ## 계획
 * 1. 두 사람의 가위바위보의 수를 입력 값을 배열로 담는다.
 * 2. n의 횟수만큼 반복문을 사용한다.
 * 3. A와 B의 서로 비교해서 비기면 D, A가 B보다 크면 A 그렇지 않으면 B를 출력하는 조건문을 세운다.
 * 4. 결과값을 List에 담아아서 출력한다.
 *
 * ## 반성
 * 문제의 조건을 잘 읽으면 금방 풀 수 있다.
 *
 */

public class 가위바위보 {

    private List<String> solution(int[] A, int[] B, int N) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                answer.add("D");
            } else if (A[i] == 1 && B[i] == 3) {
                answer.add("A");
            } else if (A[i] == 2 && B[i] == 1) {
                answer.add("A");
            } else if (A[i] == 3 && B[i] == 2) {
                answer.add("A");
            } else {
                answer.add("B");
            }
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution(new int[]{2, 3, 3, 1, 3}, new int[]{1, 1, 2, 2, 3}, 5)).isEqualTo(
            new ArrayList<>(
                Arrays.asList("A", "B", "A", "B", "D")));
    }

}
