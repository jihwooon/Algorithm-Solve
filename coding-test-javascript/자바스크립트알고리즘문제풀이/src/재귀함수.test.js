const run = (n) => {
  let answer = '';
  const DFS = (L) => {
    if (L == 0) {
      return;
    } else {
      DFS(L - 1);
      return (answer += L + '');
    }
  };
  return DFS(n);
};

describe('재귀함수', () => {
  context('자연수 N이 입력되면 재귀함수를 이용하여', () => {
    it('1부터 N까지를 리턴한다', () => {
      expect(run(3)).toBe('123');
    });
  });
});
