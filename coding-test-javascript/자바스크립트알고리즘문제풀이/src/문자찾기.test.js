/**
 * ## 미지의 것
 * 한 개의 문자를 입력 받고, 특정 문자가 몇 개 존재하는지 알아내라
 *
 * ## 자료
 * 특정 문자
 * 한 개의 문자
 * ## 조건
 * 문자 중 특정 문자의 갯수가 얼마 있는지 확인한다.
 *
 * ## 계획
 * 1. 문자와 특정 문자를 입력받는다.
 * 2. 문자를 문자 한 개 쪼개라
 * 3. 반복문을 통해서 문자를 탐색한다.
 * 4. 문자와 특정 문자가 동일하면 새로운 배열에 넣는다.
 * 5. 탐색이 끝나면 배열에 담긴 길이를 결과값으로 반환한다.
 *
 * ## 반성
 * 주언진 문자를 특정 문자를 확인하는 문제 풀이는 많다.
 * 다음에는 Map을 활용해서 문제를 풀어봐야겠다.
 */

const solution = (arr, n) => {
  const result = Array.from(arr).join(',');
  const answer = [];
  for (let x of result) {
    if (x === n) {
      answer.push(x);
    }
  }
  return answer.length;
};

describe('문자 찾기', () => {
  context('한 개의 문자를 입력 받을 때', () => {
    it('특정 문자가 몇 개를 출력하라', () => {
      expect(solution('COMPUTERPROGRAMMING', 'R')).toBe(3);
    });
  });
});
