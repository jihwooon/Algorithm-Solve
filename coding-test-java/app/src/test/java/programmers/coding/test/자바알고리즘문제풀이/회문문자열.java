package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 문자열이 입력이 되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO"를 출력하는 프로그램을 작성하시오.
 *
 * ## 자료
 * 회문 문자열
 *  >> 앞에서 읽을 때나 뒤에서 읽을 때난 같은 문자열
 *
 * ## 조건
 * 대소문자 구분 하지 않음
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. 문자열은 대소문자를 구분하지 않기 위해서 소문자인 경우 대문자로 대문자인 경우 소문자로 둘 중 하나로 변경해준다.
 * 3. 문자열의 길이를 2로 나눈 for문의 탐색은 한다.
 * 4. 문자열의 첫번째 자리와 문자열 마자믹 자리가 같지 않으면 "NO"를 반환한다.
 * 5. 같은 경우 "YES"를 반환한다.
 *
 * ## 반성
 * 회문 문제는 탐색을 절반 만큼만 탐색 한 후 첫번째 자리와 마지막 자리를 비교해서 결과값을 도출한다.
 * 이 문제는 워낙 유명해서 알고리즘 문제 유형에 많이 나온다.
 */

public class 회문문자열 {

    private String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }
        return answer;
    }

    @Test
    public void result() {
        assertThat(solution("gooG")).isEqualTo("YES");
        assertThat(solution("good")).isEqualTo("NO");
    }

    private String solution1(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int right = str.length() - 1;
        int left = 0;

        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return "NO";
            }
            right--;
            left++;
        }

        return answer;
    }

    @Test
    public void result1() {
        assertThat(solution1("gooG")).isEqualTo("YES");
        assertThat(solution1("good")).isEqualTo("NO");
    }
}
