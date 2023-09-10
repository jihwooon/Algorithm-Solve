/**
 * ## 미지의 것
 * 한 개의 문자열을 받아 해당 문자열에 알파벳 대문자가 몇 개인지 알아내는 프로그램을 작성하라
 *
 * ## 자료
 * 대문자가 포함 된 문자열
 * ## 조건
 * 문자열 길이는 100를 넘어서는 안된다
 * 대문자가 포함이 되어 있으면 갯수 만큼 반환한다.
 * ## 계획
 * 1. 대문자가 포함 된 문자열을 입력 받는다.
 * 2. 입력 받은 문자열을 탐색을 한다
 * 3. 입력 받은 문자열 중 대문자로 치환해서 비교 한다
 * 4. 대문자가 나온 만큼 갯수를 count 한다
 * ## 반성
 * 대문자를 변환하는 함수를 몰라서 생각하다가 처음에 했던 방법이 맞았다.
 * 함수를 모를 때는 함수가 아닌 아는 지식으로 풀어보는 연습을 해야겠다
 */

const solution = (str) => {
  let count = 0;

  for (x of str) {
    if (x.toUpperCase() === x) {
      count++;
    }
  }

  return count;
};

describe('대문자 찾기', () => {
  context('주어진 문자열에 알파벳 대문자가', () => {
    it('몇 개 포함되어 있는지 찾아라', () => {
      expect(solution('KoreanTimeGood')).toBe(3);
    });
  });
});
