/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let missingNum = 0;
    for (let i = 0; i < nums.length; i++) {
        missingNum = missingNum ^ nums[i];
    }
    return missingNum;
};