/**
 * ## 미지의 것
 * 소문자로 된 단어가 입력되면 그 단어의 특정 문자를 출력하라
 * ## 자료
 * 소문자로 된 단어
 * 단어 길이가 짝수 인 경우 2개의 문자 출력
 * ## 계획
 * 1. 문자를 입력한다.
 * 2. 중간 인덱스 = 문자열 길이 / 2를 구한다.
 * 3. 문자열 길이가 홀수 인 경우에 중간 값을 리턴한다
 * 4. 문자열 길이가 짝수 인 경우에 중간 2개값을 리턴한다.
 * ## 반성
 * Math.floor랑 %2의 홀수 짝수 유무를 몰랏다 이번에 확실히 배워둬야겠다.
 */

const run = (str) => {
  let answer = '';
  let mid = Math.floor(str.length / 2);
  if (str.length % 2 === 1) {
    answer = str.slice(mid, mid + 1);
  } else {
    answer = str.slice(mid - 1, mid + 1);
  }
  return answer;
};

describe('가운데 문자 출력', () => {
  context('소문자로 된 단어가 입력되면', () => {
    it('그 단어의 가운데 문자를 리턴한다', () => {
      expect(run('study')).toBe('u');
      expect(run('good')).toBe('oo');
    });
  });
});
