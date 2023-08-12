package programmers.coding.test.자바알고리즘문제풀이;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Stack;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 입력된 문자열에서 소괄호() 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하시요.
 * ## 자료
 *  소괄호 ()사이에 존재하는 모든 문자를 제거
 *
 * ## 조건
 * 소괄호() 밖에 있는 문자는 출력이 되고 그 외는 제거된다.
 *
 * ## 계획
 * 1. 문자열을 입력 받는다
 * 2. Stack 자료구조를 호출한다.
 * 3. 문자열을 foreach문으로 사용해서 stack에 담는다.
 * 4. 만약 ')'이 있다면 반복문을 통해서 pop함수를 통해서 '('전까지 담긴 값을 뺀다.
 * 5. 나머지 문자열 값을 stack에 담는다.
 * 6. stack의 담긴 문자열을 answer으로 출력한다.
 *
 * ## 반성
 * while문도 반드시 return 있어야 할 필요가 없다는 것을 알게 되었다.
 * 문자열 더하기는 어떻게 하는지 궁금했다. 근데 += 로 하면 String.append
 *
 */

public class 괄호문자제거 {

    private String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(')
                    ;
            } else {
                stack.push(x);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution("(AB)CD")).isEqualTo("CD");
        assertThat(solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)")).isEqualTo("EFLM");
    }

}
