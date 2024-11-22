/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {

   let numCopy = +String(x).replace(/[^0-9]/g, '');
   let reversed = "";
   
   while (numCopy != 0) {
        reversed += numCopy % 10;
        numCopy = Math.floor(numCopy / 10);
    }
    
    return x == +reversed; 
};