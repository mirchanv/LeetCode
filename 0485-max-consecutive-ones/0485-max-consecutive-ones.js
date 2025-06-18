/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let count = 0;
    let maxConsecutiveOnes = 0;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 1) {
            count++;
        } else {
            maxConsecutiveOnes = Math.max(count, maxConsecutiveOnes);
            count = 0;
        }
    }

    return Math.max(count, maxConsecutiveOnes);
};