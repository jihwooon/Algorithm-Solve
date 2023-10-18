/**
 * ## 미지의 것
 * 자연수가 입력되면 각 자리수의 합을 구하고, 그 합의 최대인 자연수를 출력하라
 * ## 자료
 * 자릿수
 * 배열
 * ## 조건
 * 자릿수의 합이 같은 경우 원래 수가 더 큰걸 선택한다.  
 * 
 * ## 계획
 * 1. 함수의 배열 인자값을 전달한다.
 * 2. 배열 값을 루프문으로 값을 꺼낸다.
 * 3. 배열의 값을 임시 저장한다.
 * 4. tmp 값이 존재하면 자릿수의 합을 구한다.
 * 5. 자릿수의 합이 최소값보다 크면 최소값에 저장하고 원래 값을 결과값에 저장한다
 * 6. 자릿수의 합이 최소값하고 같으면 원본 값하고 배열의 값을 비교해서 더 큰 값을 리턴하다
 * ## 반성
 * 이 문제는 여러가지 개념이 포함이 되어 있다. 자릿수 구하는 개념과 최소값 최대값 구하는 문제로 여러개념을 조합해서 문제를 풀어 갈 수 있다.
 *
 */

const solution = (arr) =>{
    let answer;
    let max = Number.MIN_SAFE_INTEGER;
    for (let x of arr) {
        let sum = 0;
        let tmp = x;
        while(tmp) {
            sum += tmp % 10
            tmp = Math.floor(tmp / 10);
        }
        if (sum >= max) {
            max = sum;
            answer = x;
        } else if (sum === max) {
            if (x > answer) {
                answer = x
            }
        }
    }

    return answer
}

describe('자릿수의 합', () => {
    context('자연수가 주어지고 자연수의 자릿수의 합을 구하면', () => {
      it('지릿수 합 중 가장 큰 자연수를 구하라', () => {
        expect(solution([128, 202])).toStrictEqual(128);
      });
    });
  });
  