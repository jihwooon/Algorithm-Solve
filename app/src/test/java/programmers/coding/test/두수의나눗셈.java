package programmers.coding.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 두수의나눗셈 {
    public int solution(int num1, int num2) {
        double answer = (double)num1 / num2 * 1000;

        return (int)answer;
    }

    @Test
    public void result() {
        assertThat(solution(3,2)).isEqualTo(1500);
        assertThat(solution(7,3)).isEqualTo(2333);
    }
}
