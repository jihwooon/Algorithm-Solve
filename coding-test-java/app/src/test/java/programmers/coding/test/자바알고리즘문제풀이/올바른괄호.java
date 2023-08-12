package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Stack;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 *
 * ## 조건
 * 문자열의 최대 길이는 30이다.
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. 문자열을 Character으로 변경한다.
 * 3. stack 자료구조를 Character으로 담아서 조건을 만들어준다.
 * 4. 만약 '('이면 stack에 push를 해서 담는다.
 * 5. 만약 stack이 비워 있으면 "NO"를 반환한다.
 * 6. stack을 pop을 해서 반환한다.
 * 7. stack이 만약 비워있지 않으면 "YES"를 반환한다.
 *
 * ## 반성
 * 스택 자료구조 함수를 잘 몰라서 이 문제를 어떻게 접근해야 할 지 몰랐다. Queue과 Stack 문제를 공부를 해야겠다.
 * 간단한 문제라서 논리적인 흐름을 머릿속에서 그려져야한다.
 */
public class 올바른괄호 {

    private String solution(String str) {
        String answer = "YES";
        char[] ch = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char s : ch) {
            if (s == '(') {
                stack.push(s);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return answer;
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution("()))")).isEqualTo("NO");
    }

}
