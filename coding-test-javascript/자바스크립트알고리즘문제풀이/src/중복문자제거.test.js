/**
 * ## 미지의 것
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하라
 *
 * ## 자료
 * 소문자
 * 중복된 문자 제거
 * 한개 문자열
 * ## 조건
 * 문자가 중복되어 있으면 중복을 제거한다.
 *
 * ## 계획
 * 1. 중복된 문자를 입력한다.
 * 2. 문자열의 문자 갯수만큼 반복한다.
 * 3. 주어진 문자값과 인덱스 값에 문자값이 일치하면 answer에 반환한다.
 * 4. 중복된 문자를 제거하고 결과값을 반환한다.
 *
 * ## 반성
 * 중복된 문자를 제거하는 방법이 다른 방법이 있는 줄 알았는데 indexOf로 걸러내는 것을 이번에 알게되었다.
 * 다음부터 중복된 문자 제거가 나온다면 indexOf를 고려해봐야겠다.
 */

const solution = (str) => {
  let answer = '';

  for (let i = 0; i < str.length; i++) {
    if (str.indexOf(str[i]) === i) {
      answer += str[i];
    }
  }
  return answer;
};

describe('중복문자제거', () => {
  context('한개의 문자를 입력하면', () => {
    it('중복된 문자를 제거하고 출력한다.', () => {
      expect(solution('ksekkset')).toStrictEqual('kset');
    });
  });
});
