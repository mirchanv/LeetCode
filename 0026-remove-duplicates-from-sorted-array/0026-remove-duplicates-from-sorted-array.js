/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let lastUniqueAtIndex = 0;

    for(let i = 1; i < nums.length; i++) {
        if (nums[i] != nums[lastUniqueAtIndex]) {
            nums[lastUniqueAtIndex + 1] = nums[i];
            lastUniqueAtIndex++;
        }
    }
    return lastUniqueAtIndex + 1;
};