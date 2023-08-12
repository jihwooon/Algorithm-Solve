package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Stack;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * ## 자료
 * 후위연산식
 * >> 352+*9- 식의 표현은 3 * (5 + 2) - 9 동일하다.
 *
 * ## 조건
 * 수식은 앞으로 보내고 연산식은 뒤로 보낸다.
 *
 * ## 계획
 * 1. 문자열 수를 입력받는다.
 * 2. 문자열 전체를 각각 for문으로 연산한다.
 * 3. char 중 수식이면 stack에 담는다.
 * 4. 만약 연산자를 만나면 다음과 같은 조건이다.
 *  >> 첫번째 꺼낸 수를 rigth에 담는다.
 *  >> 두번째 꺼낸 수를 left에 담는다.
 *  연산식에 따라 두 변수를 연산한 후 stack에 담는다.
 * 5. 결과 값을 stack의 첫번째 수를 가져온다.
 * 6. 결과값을 반환한다.
 *
 * ## 반성
 * 아직 Stack문제가 익숙하지 않아 이런 문제를 보면 떠오르지 않는다. 그렇지만 이번 문제를 풀면서 어떻게 풀어야 할지 감을 잡았다.
 */

public class 후위식연산 {

    private int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if ('0' <= x && x <= '9') {
                stack.push(x - 48);
            } else {
                int right = stack.pop();
                int left = stack.pop();

                if (x == '+') {
                    return left + right;
                } else if (x == '-') {
                    return left - right;
                } else if (x == '*') {
                    return left * right;
                } else if (x == '/') {
                    return left / right;
                }
            }
            answer = stack.get(0);
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution("32+")).isEqualTo(5);
    }

}
