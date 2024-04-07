/**
 * ## 미지의 것
 *  A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 * ## 자료
 * 오름차순
 * 배열
 * ## 조건
 * 두 배열의 공통 원소
 *
 * ## 계획
 * 1. 두 배열의 수를 구한다.
 * 2. 두 배열을 오름차순으로 정렬한다.
 * 3. 0 ~ 배열의 길이만큼 탐색을 한다.
 * 4. 두 배열의 원소값이 일치하면 빈 배열에 푸시한다.
 * 5. 그렇지 않으면 원소값을 증감한다.
 * 6. 결과값을 리턴한다.
 * ## 반성
 * 오름 차순을 정렬하는 문법을 몰랐다. sort의 a - b는 오름차순 b - a는 내림차순을 이해해야한다.
 * 투포인트 알고리즘은 O(n log n)로 효율성이 좋다.
 */

const solution = (arr1, arr2) => {
	let answer = [];
	let x = 0;
	let y = 0;
	arr1.sort((a, b) => a - b);
	arr2.sort((a, b) => a - b);

	while (x <= arr1.length && y <= arr2.length) {
		if (arr1[x] === arr2[y]) {
			answer.push(arr1[x++])
			y++
		} else if (arr1[x] < arr2[y]) {
			x++
		} else {
			y++
		}
	}

	return answer;
};

describe('공통원소', () => {
	context('두 집합의 공통 원소를 추출하여', () => {
		it('오름차순으로 출력하라', () => {
			expect(
				solution([1, 3, 9, 5, 2], [3, 2, 5, 7, 8]),
			).toStrictEqual([2, 3, 5]);
		});
	});
});
