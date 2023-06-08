package programmers.coding.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 나머지구하기 {

    public int solution(int num1, int num2) {
        return num1 % num2;
    }
    @Test
    public void result() {
        assertThat(solution(1, 3)).isEqualTo(1);
        assertThat(solution(10, 5)).isEqualTo(0);
    }
}
