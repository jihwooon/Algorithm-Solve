package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.anyOf;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 학생이 적어 낸 숫자 중 중복된 숫자가 존재하면 D 아니면 U를 출력하라
 * ## 자료
 * 중복된 숫자
 * >> Duplication
 * 각각 다른 숫자
 * >> Unique
 *
 * ## 조건
 * 주어진 배열 내에 숫자 중 중복 숫자가 존재하는지 여부를 파악하는 것이다.
 * ## 계획
 * 1. 주어진 배열의 내의 숫자를 입력 받는다.
 * 2. 그 숫 중 인덱스 수 하나를 뽑아서 비교한다.
 * 3. 만약 중복된 숫자가 존재하면 D로 출력한다.
 * 4. 그렇지 않으면 U로 출력한다.
 *
 * ## 반성
 * 이 문제를 보고 왜 나는 삽입 정렬로 풀어야 한다는 생각을 했을까? 단순하게 생각하면 오름차순으로 정렬 후 앞과 뒤의 숫자만 비교하면 문제를 쉽게 풀 수 있었다.
 * 여기까지 생각해볼려면 문제를 많이 접해봐야겠다!
 */

public class 중복확인 {

    private String solution(int[] students) {
        String answer = "U";
        Arrays.sort(students);
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i] == students[i + 1]) {
                answer = "D";
            }
        }

        return answer;
    }

    @Test
    @DisplayName("정렬로 문제를 풀어라")
    public void result() {
        assertThat(solution(new int[]{20, 25, 52, 30, 39, 33, 43, 33})).isEqualTo("D");
    }

    private String solution1(int[] students) {
        String result = "U";
        Arrays.sort(students);
        Map<Integer, Integer> maps = new HashMap<>();

        for (int x : students) {
            maps.put(x, maps.getOrDefault(x, 0) + 1);
            if (maps.get(x) > 1) {
                result = "D";
            }
        }

        return result;
    }

    @Test
    @DisplayName("해쉬로 문제를 풀어라")
    void result1() {
        assertThat(solution1(new int[]{20, 25, 52, 30, 39, 33, 43, 33})).isEqualTo("D");
    }

}
