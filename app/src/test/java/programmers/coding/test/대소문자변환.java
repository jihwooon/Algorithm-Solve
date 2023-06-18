package programmers.coding.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것 대소문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자를 대문자로 출력하는 프로그램을 작성하시오.
 *
 * ## 자료
 *
 * ## 조건
 * 문자열의 길이가 100을 넘어서 안된다.
 * 문자열은 영어 알파벳으로 구성이 되어 있다.
 *
 * ## 계획
 * 1. 입력 받은 문자열을 글자 하나하나 셀 수 있게 배열로 변환한다.
 * 2. 소문자인 경우 대문자로 변경하고 대문자인 경우 소문자로 변경하도록 toUpperCase와 toLowerCase를 사용한다.
 * 3. answer로 결과값을 받는다.
 *
 * ## 반성
 * 문제가 쉽다고 생각했지만 String의 함수를 제대로 모르면 문제를 풀 수가 없었다. 그래서 String의 내부의 구조를 다시 공부를 해야 겠다.
 * 그리고 Character도 다시 공부를 해야 겠다.
 */
class 대소문자변환 {

  String solution(String input) throws Exception {
    String answer = "";

    for (char ch : input.toCharArray()) {
      if (input.length() > 100) {
        throw new Exception("문자열 길이는 100가 넘었습니다.");
      }

      if (Character.isLowerCase(ch)) {
        answer += Character.toUpperCase(ch);
      } else {
        answer += Character.toLowerCase(ch);
      }

    }
    return answer;
  }

  @Test
  void result() throws Exception {
    assertThat(solution("StuDY")).isEqualTo("sTUdy");
  }
}
