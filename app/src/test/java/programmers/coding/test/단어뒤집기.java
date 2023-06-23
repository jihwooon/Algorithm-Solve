package programmers.coding.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하시오.
 * ## 자료
 * N개의 단어
 * 뒤집어 출력
 *
 * ## 조건
 * 주어진 단어를 뒤집는다.
 * 단어는 영어 알파벳으로만 구성 되어야 한다.
 *
 * ## 계획
 * 1. 문자열 입력받는다.
 * 2. StringBuffer에 입력 받는다.
 * 3. stringBuffer.reverse()로 문자열을 뒤집는다.
 * 4. String로 변환해서 출력한다.
 *
 * ## 반성
 * 처음 문자 뒤집기라고해서 charArray를 사용했는데 이것도 하나의 방법 인 것 같다.
 * 같은 문제를 다른 방법으로 접근해봐야겠다.
 */
public class 단어뒤집기 {

    private String solution(String N) {
        StringBuffer stringBuffer = new StringBuffer(N);
        String reverString = String.valueOf(stringBuffer.reverse());

        return reverString;
    }

    @Test
    public void result() {
        assertThat(solution("good")).isEqualTo("doog");
    }
}
