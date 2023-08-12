package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하시오.
 * ## 자료
 * N개의 단어
 * 뒤집어 출력
 *
 * ## 조건
 * 주어진 단어를 뒤집는다.
 * 단어는 영어 알파벳으로만 구성 되어야 한다.
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. 입력 받은 문자와 문자의 길이를 swap의 메소드를 생성한다.
 * 3. 문자열을 배열 형태로 변환한다.
 * 4. 첫번째 자리부터 마지막 자리까지의 각각 수를 구한다.
 * 5. 왼쪽의 수보다 오른쪽의 수가 작을 경우 반복문을 통해서 자리를 서로 바꾼다.
 * 6. 결과값을 ArrayList에 담는다.
 * 7. ArrayList에 담은 수를 list의 크기만큼 반복 한다.
 * 8. 결과값을 출력한다.
 *
 * ## 반성
 * StringBuffer의 구현 된 메서드를 사용하지 않고 직접 구현을 해봤다. 처음에 잘 못 생각해서 반복문을 써서 자릿수를 바꿀려고 했다.
 * 근데 반복문에 계속 반복해서 정상적으로 출력이 되지 않았다.
 * while으로 변경해서 사용해보니 제대로 출력이 되었다.
 * 정렬 알고리즘을 한번 구현해봐야겠다.
 */
public class 단어뒤집기 {

    private String solution(String N) {
        ArrayList<String> result = swap(N, N.length());
        String answer = "";

        for (String x : result) {
            answer = x;
        }

        return answer;
    }

    private ArrayList<String> swap(String str, int n) {
        ArrayList<String> result = new ArrayList<>();
        char[] s = str.toCharArray();
        int lf = 0;
        int rf = n - 1;

        while (lf < rf) {
            char tmp = s[lf];
            s[lf] = s[rf];
            s[rf] = tmp;
            lf++;
            rf--;
        }
        String tmp = String.valueOf(s);
        result.add(tmp);

        return result;
    }

    @Test
    public void result() {
        assertThat(solution("good")).isEqualTo("doog");
        assertThat(solution("Time")).isEqualTo("emiT");
        assertThat(solution("Big")).isEqualTo("giB");
    }
}
