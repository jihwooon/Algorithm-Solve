package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Stack;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 잘려진 쇠막대기 조각의 총 개수를 구하라
 *
 * ## 자료
 * - 쇠막대기
 * >> 쇠막대기의 왼쪽 끝은 여는 괄호 ‘ ( ’ 로, 오른쪽 끝은 닫힌 괄호 ‘) ’ 로 표현
 * - 레이저 배치
 * >> 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍 ‘( )’
 *
 * ## 조건
 *
 *
 * ## 계획
 * 1. 괄호 문자열을 입력 받는다.
 * 2. 스택에 쌓기 위해서 스택을 구현한다.
 * 3. 괄호 문자열이 '('이면 stack에 push를 한다.
 * 4. 만약 문자열에 ')'를 만난다면 pop을 합니다.
 * 5. pop하고 바로 앞에 괄호가 '('이면 레이저로 간주하고 스택의 Size를 센다.
 * 6. '(' 아닐 경우 막대기로 간주하고 answer를 size 만큼 더한다.
 * 7. 결과값을 반환한다.
 *
 * ## 반성
 * 이 문제를 풀이법을 떠올려야만 풀 수 있는 문제이다. 그렇지만 코드를 보면 단순하다.
 * 문제를 보고 쫄지 말고 문제를 천천히 따라가면서 풀면 풀 수 있는 문제인거 같다.
 * stack 문제를 다루면서 괄호 문제를 많이 만나는데 많이 접해봐야 알 수 있을 것 같다.
 *
 */

public class 쇠막대기 {

    private int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (str.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution("()(((()())(())()))(())")).isEqualTo(17);
        assertThat(solution("(())")).isEqualTo(2);
    }

}
