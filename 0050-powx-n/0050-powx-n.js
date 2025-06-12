/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {
    if (n > 0) return x ** n;
    
    n = Math.abs(n);
    return 1 / (x ** n);
};