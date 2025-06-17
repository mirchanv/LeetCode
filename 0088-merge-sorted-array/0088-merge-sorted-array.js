/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    if (nums2.length == 0) return;

    const newArr = [];
    let c1 = 0;
    let c2 = 0;
    
    for (let i = 0; i < m + n; i++) {
        if (c1 < m && c2 < n) {
            if (nums1[c1] <= nums2[c2]) {
                newArr[i] = nums1[c1];
                c1++;
            } else {
                newArr[i] = nums2[c2];
                c2++;
            }
        }
    }

    while(c1 < m) {
        newArr.push(nums1[c1]);
        c1++;
    }

    while(c2 < n) {
        newArr.push(nums2[c2]);
        c2++;
    }

    // last
    for (let i = 0; i < m + n; i++) {
        nums1[i] = newArr[i];
    }
};