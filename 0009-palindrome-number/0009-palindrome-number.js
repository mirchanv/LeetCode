/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    const numStr = String(x);
  let left = 0;
  let right = numStr.length - 1;

  while (left < right) {
    if (numStr.charAt(left) != numStr.charAt(right)) {
      return false;
    }

    left++;
    right--;
  }
  return true;
};