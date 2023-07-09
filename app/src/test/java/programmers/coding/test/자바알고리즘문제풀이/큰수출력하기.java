package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 *
 * ## 자료
 * 정수 N
 * 앞 수보다 큰 수
 *
 * ## 조건
 * 첫 번째 수는 무조건 출력한다
 * ## 계획
 * 1. List의 수와 정수 N을 입력 받는다.
 * 2. 첫 번째 수를 출력한다.
 * 3. 2번째 자리부터 정수 N까지 반복문을 사용한다.
 * 4. 바로 앞 수보다 크면 출력한다.
 * 5. 결과값을 반환한다.
 *
 * ## 반성
 * 문제는 간단하다. 조건을 제대로 읽지 않아서 무슨 말인지 몰랐다.
 */
public class 큰수출력하기 {

    private List<Integer> solution(ArrayList<Integer> arrayList, int N) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arrayList.get(0));

        for (int i = 1; i < N; i++) {
            if (arrayList.get(i) > arrayList.get(i - 1)) {
                result.add(arrayList.get(i));
            }
        }

        return result;
    }

    @Test
    public void result() {
        assertThat(solution(new ArrayList<>(Arrays.asList(7, 3, 9, 5, 6, 12)), 6)).isEqualTo(
            List.of(7, 9, 6, 12));
    }

}
