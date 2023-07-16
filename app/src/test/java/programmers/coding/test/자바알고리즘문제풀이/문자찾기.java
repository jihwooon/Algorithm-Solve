package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 특정 문자를 입력받아 해당 특정문자가 입력 받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *
 * ## 자료
 * 문자열(영어 알파벳)
 *
 * ## 조건
 * 문자열은 영어 알파벳
 *
 * ## 계획
 * 1. 주어진 문자열과 특정 문자를 입력 받는다.
 * 2. 주어진 문자열을 배열로 변환해서 반복문으로 순회한다.
 * 3. 해당 문자를 대소문자 중 하나로 변환한다.
 * 4. 지정한 함수를 key와 get(key)에 적용한다. key와 결과를 연관시키거나 결과가 null이면 키를 제거한다.
 * 5. 특정 문자의 k의 결과값을 반환한다.
 *
 * ## 반성
 * Map을 이용해서 문제를 풀어봤다 결과적으로 잘 작동한다. 문제집에서 풀어봤던 것을 다르게 풀어보니 잘 적용이 된다.
 *
 */
public class 문자찾기 {

    private int solution(String str, char c) {
        Map<Character, Integer> result = new HashMap<>();

        for (char x : str.toCharArray()) {
            char lowerCase = Character.toLowerCase(x);
            result.compute(lowerCase, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result.get(c);
    }

    @Test
    @DisplayName("문자열이 주어지고, 문자가 주어지면 해당 문자의 개수를 출력한다.")
    public void result() {
        assertThat(solution("Computercooler", 'c')).isEqualTo(2);
        assertThat(solution("Computercooler", 'o')).isEqualTo(3);
    }

    private int solution1(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }

        return answer;
    }

    @Test
    @DisplayName("문자열이 주어지고, 문자가 주어지면 해당 문자의 개수를 출력한다.")
    public void result1() {
        assertThat(solution1("Computercooler", 'c')).isEqualTo(2);
    }
}
