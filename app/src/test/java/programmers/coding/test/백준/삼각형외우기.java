package programmers.coding.test.백준;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


/**
 * ## 미지의 것
 * 삼각형의 세 각을 입력받은 다음 조건에 따라 문자를 출력하라
 * ## 자료
 * 세 각
 * ## 조건
 * 1. 세 각의 크기가 모두 60이면 Equilateral
 * 2. 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
 * 3. 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
 * 4. 세 각의 합이 180이 아닌 경우에는 Error
 *
 * ## 계획
 * 1. 세 각의 합이 180이 아니면 "Error" 나오게 한다.
 * 2. 사 각이 합이 180이면 다음과 같이 조건을 건다.
 *  a. x,y,z 각각이 60이면 "Equilateral" 리턴한다.
 *  b. x,y,z 중 두 각이 같은 경우 일 때 Isosceles 리턴한다.
 *  c. 아닌 경우 Scalene 리턴한다.
 * 3. answer 문자열을 반환한다.
 *
 * ## 반성
 * and, or 조건이 헷갈렸다.
 * and 인 경우에는 주어진 값들이 참인 경우에만 전체가 참이 된다.
 * or는 둘 중 하나가 참인 경우 전체가 참이 된다.
 * 진리표를 그려가면서 해야 위에 것들을 헷갈리지 않고 제대로 할 수 있을 것 같다.
 */

public class 삼각형외우기 {

    private String solution(int x, int y, int z) {
        String answer = "";

        if (x + y + z != 180) {
            answer = "Error";
        }

        if (x + y + z == 180) {
            if (x == 60 || y == 60 || z == 60) {
                answer = "Equilateral";
            } else if (x == y || x == z || z == x) {
                answer = "Isosceles";
            } else {
                answer = "Scalene";
            }
        }
        return answer;
    }

    @Test
    public void result() {
        assertThat(solution(60, 60, 70)).isEqualTo("Error");
        assertThat(solution(50, 80, 50)).isEqualTo("Isosceles");
        assertThat(solution(70, 30, 80)).isEqualTo("Scalene");
        assertThat(solution(60, 60, 60)).isEqualTo("Equilateral");
    }
}
