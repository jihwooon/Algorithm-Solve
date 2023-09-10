/**
 * ## 미지의 것
 * 문자열이 입력되면 해당 문자열이면 회문 문자열이면 'YES' 아니면 'NO'를 출력한다,
 * 단 문자열을 대소문자를 구별하지 않는다.
 * ## 자료
 * 회문 문자열
 *  >> 앞에서 읽거나 뒤어서 읽어도 같은 문자열
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. 입력 받는 문자열은 대소문자를 구별하지 않는 조건으로 대문자 혹은 소문자로 변환한다
 * 3. 앞 자리 와 맨 뒤 자리를 비교해서 문자가 동일한지 확인한다.
 * 4. 만역 앞 자리와 맨 뒤 자리가 동일하지 않으면 'NO'를 반환한다.
 *
 * ## 반성
 * 배열에 중간 숫자 부분을 어떻게 나눌까 했었는대 str.길이 / 2 로 Math.floor로 하면 되는 것이였다
 * 숫자 함수가 아직 부족해서 이 부분을 정리를 해야겟다.
 */

const solution = (str) => {
  let answer = '';
  str = str.toUpperCase();

  for (let i = 0; i < Math.floor(str.length / 2); i++) {
    if (str[i] != str[str.length - i - 1]) {
      answer = 'NO';
    } else {
      answer = 'YES';
    }
  }

  return answer;
};

describe('회문 문자열', () => {
  context(
    '대소문자 구분 없는 문자열이 입력될 때 회문 문자열이면',
    () => {
      it('YES 아니면 NO를 출력한다', () => {
        expect(solution('gooG')).toBe('YES');
        expect(solution('GoaG')).toBe('NO');
      });
    },
  );
});
