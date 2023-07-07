package programmers.coding.test.자바알고리즘문제풀이;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하세요.
 *
 * ## 자료
 * N은 환자
 * M은 순서
 * 환자 위험도
 *  >> (50 <= 환자 위험도 <= 100)
 *
 * ## 조건
 * 환자 위험도가 높은 순서대로 진료를 먼저 받는다.
 * 대기 목록상 M번 대기목록의 첫번째는 0번쩨로 간주한다.
 * >> 환자를 접수 순서대로의 목록에서 제일 앞에 있는 환자 목록을 꺼낸다.
 * >> 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣습니다. 그렇지 않으면 진료를 받습니다
 *
 * ## 계획
 * 1. 환자 목록을 배열로 받는다.
 * 2. Person의 클래스 id(순서),priority(환자 위험도) 담아서 만든다.
 * 3. Queue 자료구조에 Person 클래스를 담는다.
 * 4. Queue 자료구조에 Person을 순서대로 담는다.
 * 5. Queue가 비어있지 않으면 맨 앞에 숫자를 뽑는다.
 * 6. Queue에 위험도가 뽑힌 숫자의 우선 위험도 보다 낮으면 뒤로 보낸다.
 * 7. null이 발생하면 반복문에서 빠져나온다.
 * 8. tmp가 n의 값이 같으면 결과값을 반환한다.
 *
 * ## 반성
 * 아직도 논리 순서대로 구현하는 것이 어렵다. 감으로 문제를 풀려고 하니까 제대로 된 답이 나오지 않는것 같다.
 * Queue 자료구조에 대해서 공부를 제대로 해야겠다.
 */

public class 응급실 {

    static class Person {

        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    private int solution(int[] patients, int n) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < patients.length; i++) {
            queue.offer(new Person(i, patients[i]));
        }

        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person x : queue) {
                if (x.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == n) {
                    return answer;
                }
            }
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution(new int[]{60, 50, 70, 80, 90}, 2)).isEqualTo(3);
        assertThat(solution(new int[]{60, 70, 50, 80, 90}, 2)).isEqualTo(5);
        assertThat(solution(new int[]{70, 60, 90, 60, 60, 60}, 3)).isEqualTo(4);
    }

}
