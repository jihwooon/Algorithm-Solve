package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 *
 * ## 자료
 * 알파벳 문자열
 * 같은 문자가 연속으로 반복되는 경우 문자 바로 옆에 반복 횟수 표기
 *
 * ## 조건
 * 문자열의 길이는 100이 넘지 않는다.
 *
 * ## 계획
 * 1. count를 1로 초기화한다.
 * 2. 첫번째 문자열 자리와 두번재 문자열 자리를 비교해서 같으면 count를 센다.
 * 3. 만약 같지 않으면 문자열을 누적한다.
 * 4. count가 1보다 크면 문자열 뒤에 붙여준다.
 * 5. 결과값을 출력한다.
 *
 * ## 반성
 * 문자열 압축문제는 자주 나오는 유형이라서 문자를 계속해서 풀어봐야겠다.
 *
 */

public class 문자열압축 {

    private String solution(String str) {
        String answer = "";
        str = str + " ";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                answer += str.charAt(i);
                if (count > 1) {
                    answer += String.valueOf(count);
                    count = 1;
                }
            }
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution("KKHSSSSSSSE")).isEqualTo("K2HS7E");
    }

}
