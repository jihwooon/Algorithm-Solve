const gcd = (a, b) => {
	if (b === 0) return a;
	return gcd(b, a % b);
}

const solution = (arr) => {
	return arr.reduce((a, b) => (a * b) / gcd(a, b));
}

describe('N개의 최소공배수', () => {
	context('n개의 숫자를 담은 배열 arr이 입력되었을 때 ', () => {
		it('이 수들의 최소공배수를 반환하는 수를 반환하라', () => {
			expect(solution([2, 7])).toBe(14);
		});
	});
});
