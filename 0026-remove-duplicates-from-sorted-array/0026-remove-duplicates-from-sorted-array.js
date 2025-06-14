/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let lastUniqueAtIndex = 0;
    for(let i = 1; i < nums.length; i++) {
        if (nums[i] != nums[lastUniqueAtIndex]) {
            lastUniqueAtIndex++;
            nums[lastUniqueAtIndex] = nums[i];
        }
    }
    return lastUniqueAtIndex + 1;
};