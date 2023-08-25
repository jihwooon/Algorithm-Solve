/**
 * ## 미지의 것
 * 두 사람의 각 회의 가위, 바위 ,보 정보가 주어지면 각 회를 누가 이겼는지 출력하라
 *
 * ## 자료
 * 1: 가위, 2: 바위, 3:보
 * N은 게임 횟수
 * ## 조건
 * 각 줄의 회의 승자를 출력한다.
 * 비겼을 경우 D를 출력한다.
 * ## 계획
 * 1. 각 a,b의 값을 배열로 입력받는다.
 * 2. a의 횟수만큼 반복한다.
 * 3. a의 자리와 b의 자리가 동일하면 D를 출력한다.
 * 4. 그렇지 않을 경우 A를 출력한다.
 * 5. 모든 조건이 충족하지 않을 때 B를 출력한다.
 * 6. 결과값을 반환한다.
 * ## 반성
 * 가위바위보 문제라고 하는데 문제를 제대로 이해하지 못했다. 자바스크립트 문법이 익숙하지 않아서 사고가 잘 안 된다.
 */

const solution = (a, b) => {
  let answer = '';
  for (let i = 0; i < a.length; i++) {
    if (a[i] == b[i]) {
      answer += 'D' + ' ';
    } else if (a[i] === 1 && b[i] === 3) {
      answer += 'A' + ' ';
    } else if (a[i] === 2 && b[i] === 1) {
      answer += 'A' + ' ';
    } else if (a[i] === 3 && b[i] === 2) {
      answer += 'A' + ' ';
    } else {
      answer += 'B' + ' ';
    }
  }

  return answer;
};

describe('가위바위보', () => {
  context(
    '두 사람의 각 회의 가위, 바위, 보 정보가 주어지면',
    () => {
      it('각 회를 누가 이겼는지 출력하라', () => {
        expect(
          solution([2, 3, 3, 1, 3], [1, 1, 2, 2, 3]),
        ).toStrictEqual('A B A B D ');
      });
    },
  );
});
