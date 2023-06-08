package programmers.coding.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 숫자비교하기 {
    public int solution(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;

        return answer;
    }
    @Test
    public void result() {
        assertThat(solution(2,3)).isEqualTo(-1);
        assertThat(solution(3,3)).isEqualTo(1);
    }
}
