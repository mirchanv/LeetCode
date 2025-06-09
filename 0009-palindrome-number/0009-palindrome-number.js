/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x < 0) return false; // handling -ve nums

  let copyNum = x;
  let reversedNum = 0;

  while (copyNum > 0) {
    let lastDigit = copyNum % 10;
    reversedNum = reversedNum * 10 + lastDigit;
    copyNum = Math.floor(copyNum / 10);
  }

  return reversedNum == x;
};