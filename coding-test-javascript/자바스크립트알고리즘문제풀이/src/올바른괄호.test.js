/**
 * ## 미지의 것
 * 괄호가 올바르면 Yes 아니면 No를 출력하라
 * ## 자료
 * 괄호 문자열
 * 
 * ## 계획
 * 1. 괄호를 입력받는다.
 * 2. stack을 생성하낟.
 * 3. 문자열을 반복문을 통해서 각각 나눈다.
 * 4. '('이면 stack에 입력한다.
 * 5. stack의 길이가 0이면 'NO'를 출력한다
 * 6. stack를 pop한다.
 * 7. 결과를 반환한다.
 * 
 * ## 반성
 * 문법이 헷갈려서 어렵다...
 */

const solution = (arr) => {
    console.log(arr)
    let answer = 'YES';
    stack = []
    for(let x of arr) {
        if (x === '(') {
            stack.push(x)
        } else {
            if (stack.length === 0) {
                return 'NO'
            }
            stack.pop();
        }
    }

    return answer
}

describe('올바른 괄호', () => { 
  context('입력된 값이', () => {
    it('올바르면 YES 아니면 NO를 출력한다. ', () => {
      expect(solution('()')).toBe('YES')
      expect(solution('())')).toBe('NO')
      expect(solution('()()')).toBe('YES')
    })
  })
})
