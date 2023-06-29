package programmers.coding.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 수열을 내림차순으로 정렬하는 프로그램을 만드시오
 * ## 자료
 * 수열
 * >> 수의 나열
 * 내림차순
 * >> 큰 수부터 작은 수로 정렬
 * 오름차순
 * >> 작은수부터 큰 수로 정렬
 * ## 조건
 * 수의 범위는 1 <= 100,000 이하 자연수
 * ## 계획
 * 1. 입력 받을 수를 배열로 받느다.
 * 2. Arrays 함수를 통해서 오름차순으로 정렬 후 익명함수로 내림차순으로 변경한다.
 * 3. 결과값을 반환한다.
 *
 * ## 반성
 * 내림차순을 구현하려고 하니까 어렵다. Arrays.sort는 오름차순으로 정렬이 되는데 내림차순으로 정렬을 하려면 옆에 따로 구현을 해야한다
 * Comparator 인터페이스에서 o1, o2를 빼면 서로 바뀐다. 함수형 코딩을 안 하고 서는 자바를 구현하는게 어렵긴하다.
 * 자바 8 람다랑 익명함수를 꼭 공부를 해야겠다.
 */

public class 위에서아래로 {

    private Integer[] solution(Integer... n) {
        Arrays.sort(n, (o1, o2) -> o2 - o1);
        return n;
    }

    @Test
    public void result() {
        assertThat(solution(new Integer[]{15, 27, 12})).isEqualTo(new Integer[]{27, 15, 12});
    }
}
