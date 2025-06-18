/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length;

    // calculate sum of first n natural nums
    let sumN = (n * (n + 1)) / 2;
    
    // calculate total sum in nums
    let sumNums = 0;
    for (let i = 0; i < n; i++) {
        sumNums += nums[i];
    }

    return sumN - sumNums;
};