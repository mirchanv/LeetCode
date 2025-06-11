/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let xCopy = x;
    xCopy = Math.abs(xCopy);
    let rev = 0;
    
    while(xCopy > 0) {
        let lastDigit = xCopy % 10;
        rev = (10 * rev) + lastDigit;
        xCopy = Math.floor(xCopy / 10);
    }
    
    const limit = Math.pow(2, 31);
    if (rev < -limit || rev > limit) return 0;

    return x < 0 ? -rev : rev;

};