/**
 * ## 미지의 것
 * 자연수 N이 입력되면 1부터 N까지의 합을 출력하라
 * ## 자료
 * 자연수 N
 *
 * ## 계획
 * 1. 자연수 n을 입력받는다.
 * 2. 자연수 n이 20을 초과하면 에러를 발생한다.
 * 3. n + n - 1 .... n 자리수만큼 더한다.
 * 4. 결과값을 출력한다.
 * ## 반성
 * for문으로 이용해서 풀수 있다. 하지만 재귀함수로 푸는 연습이 필요해서 재귀로 도전했다.
 *
 */

const solution = (n) => {
  if (n >= 20) {
    throw new Error('자연수 20을 초과했습니다.');
  }
  if (n <= 0) {
    return 0;
  }

  return n + solution(n - 1);
};

describe('1부터N까지합', () => {
  context('자연수가 주어지면', () => {
    it('합을 출력한다', () => {
      expect(solution(6)).toBe(21);
      expect(solution(5)).toBe(15);
    });
  });
  context('자연수가 20이상이면', () => {
    it('Error를 던진다.', () => {
      try {
        solution(21);
      } catch (err) {
        expect(err).toEqual(
          new Error('자연수 20을 초과했습니다.'),
        );
      }
    });
  });
});
