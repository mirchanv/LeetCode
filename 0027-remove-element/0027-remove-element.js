/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let x = 0;
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            let temp = nums[i];
            nums[i] = nums[x];
            nums[x] = temp;
            x++;
        }
    }
    return x;
};