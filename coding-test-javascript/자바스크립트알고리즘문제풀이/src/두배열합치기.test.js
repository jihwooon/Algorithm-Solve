/**
 * ## 미지의 것
 *  오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하라
 * ## 자료
 * 오름차순
 * 배열
 * ## 조건
 * 두 배열의 오름차순
 * 
 * ## 계획
 * 1. 두 배열을 입력받는다.
 * 2. 각 배열의 길이를 구한다
 * 3. 두 배열의 크기를 반복문으로 반복한다
 * 4. arr1과 arr2 중 값이 작거나 같으면 먼저 push를 한다
 * 5. 그렇지 않으면 나중에 push 한다
 * 6. 두 배열 비교 한 배열이 끝나면 나머지는 그대로 push를 한다
 * 7. 결과를 반환한다
 * ## 반성
 * 투포인터는 두 배열을 구해서 병합을 하는 문제이다 이 문제는 배열의 특성을 잘 이해해야만 문제를 쉽게 이해 할 수 있다.
 * 자바스크립트는 배열 크기가 동적으로 변경이 되어서 크기 조정이 쉽다
 */

const solution = (arr1, arr2) =>{
    let answer = []
    let n = arr1.length;
    let m = arr2.length;
    let p1 = p2 = 0

    while (p1 < n && p2 < m) {
        if(arr1[p1] <= arr2[p2]) {
            answer.push(arr1[p1++])
        } else {
            answer.push(arr2[p2++])
        }
    }

    while(p1 < n) {
        answer.push(arr1[p1++])
    }

    while(p2 < m) {
        answer.push(arr2[p2++])
    }
    
    return answer
}

describe('두배열합치기', () => {
    context('주어진 문자열에 알파벳 대문자가', () => {
      it('몇 개 포함되어 있는지 찾아라', () => {
        expect(solution([1,3,5], [2,3,6,7,9])).toStrictEqual([1,2,3,3,5,6,7,9]);
      });
    });
  });
  