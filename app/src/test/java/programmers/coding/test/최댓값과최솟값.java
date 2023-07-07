package programmers.coding.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
 *
 * ## 자료
 * 최소값
 * 최대값
 * 문자열
 *
 * ## 조건
 * 둘 이상 정수에 공백으로 구분한다.
 * (최소값)공백(최대값) 형태로 문자열 반환
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. 문자열의 공백을 제거한다.
 * 3. 최소값과 최대값의 변수를 생성한다.
 * 4. for으로 문자열의 값을 숫자로 반환한다.
 * 5. Math 함수를 사용해서 최소값과 최대값을 비교해서 반환한다.
 * 6. 새로운 문자열에 (최소값) + " " + (최대값) 형태로 결과값을 리턴한다.
 *
 * ## 반성
 * 문자열을 char 형태로 변환해서 뽑을려고 했다. 이 방법이 더 복잡하고 코드도 길어진다.
 * 최소값과 최대값을 구할 때 Math함수와 MAX_VALUE와 MIN_VALUE를 잘 활용해야겠다.
 */

public class 최댓값과최솟값 {

    public String solution(String s) {
        String answer = "";

        String[] split = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < split.length; i++) {
            int number = Integer.parseInt(split[i]);

            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        answer = min + " " + max;

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution("1 2 3 4")).isEqualTo("1 4");
    }


    public String solution1(String str) {
        String answer = "";
        String[] split = str.split(" ");
        int[] arrayList = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            arrayList[i] = Integer.parseInt(split[i]);
        }

        int min = Arrays.stream(arrayList).min().getAsInt();
        int max = Arrays.stream(arrayList).max().getAsInt();

        answer = min + " " + max;

        return answer;
    }

    @Test
    public void result1() {
        assertThat(solution1("1 2 3 4")).isEqualTo("1 4");
    }
}
