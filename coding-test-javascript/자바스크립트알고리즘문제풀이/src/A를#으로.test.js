/**
 * ## 미지의 것
 * 대문자로 이루어진 영어단어에 포함된 A를 #으로 바꾸어 출력하라
 *
 * ## 자료
 * 영어단어 대문자
 *
 * ## 계획
 * 1. 대문자로 된 문자를 입력한다.
 * 2. 단어 중 A가 포함되어 있는지 확인한다.
 * 3. A가 존재하면 #으로 대체한다.
 * 4. 그렇지 않으면 출력한다.
 *
 * ## 반성
 * 문자열 대체 문제이다. 이 문제는 문자열의 함수를 알고 있으면 쉽게 풀 수 있습니다.
 */

const run = (str) => {
  let answer = '';
  for (let x of str) {
    if (x === 'A') {
      answer += '#';
    } else {
      answer += x;
    }
  }

  return answer;
};

const run1 = (str) => {
  return str.replace(/A/g, '#');
};

describe('A를 #으로', () => {
  context('입력된 영어단어에 A가 포함되어 있으면', () => {
    it('#으로 바꾸어 리턴한다', () => {
      expect(run('BANANA')).toBe('B#N#N#');
    });

    it('#으로 바꾸어 리턴한다', () => {
      expect(run1('BANANA')).toBe('B#N#N#');
    });
  });
});
