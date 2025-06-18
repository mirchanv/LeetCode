/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length;

    // calculate sum of first n natural nums
    let sumN = 0;
    for (let i = 1; i <= n; i++) {
        sumN += i;
    }
    
    // calculate total sum in nums
    let sumNums = 0;
    for (let i = 0; i < n; i++) {
        sumNums += nums[i];
    }

    return sumN - sumNums;
};