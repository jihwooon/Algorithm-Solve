package programmers.coding.test.프로그래머스;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 * ## 자료
 * 문자열
 * 뒤집기
 *
 * ## 조건
 * 주어진 문자를 뒤집는다.
 *
 * ## 계획
 * 1. 입력 받은 문자를 반대로 탐색을 한다.
 * 2. 새로운 문자열에 결과를 담아서 반환한다.
 *
 * ## 반성
 * 문자열 뒤집기에는 StringBuilder에 reverse 함수를 사용하면 된다.
 * 직접 뒤집기를 하려면 맨뒤에 문자부터 차례로 앞으로 보내면 된다.
 */
public class 문자열뒤집기 {

    private String solution1(String str) {
        String answer = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            answer += String.valueOf(str.charAt(i));
        }

        return answer;
    }

    @Test
    public void result1() {
        assertThat(solution1("jaron")).isEqualTo("noraj");
    }

    public String solution(String my_string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(my_string);
        stringBuilder.reverse();

        return stringBuilder.toString();
    }

    @Test
    public void result() {
        assertThat(solution("jaron")).isEqualTo("noraj");
    }
}
