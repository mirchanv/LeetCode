class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones = 0;
        int zeros = 0;

        for (int preference : students) {
            if (preference == 1) ones++;
            else zeros++;
        }

        for (int currSandwich : sandwiches) {
            if (currSandwich == 0) 
                if (zeros > 0) zeros--;
                else return ones;
            else  {
                if (ones > 0) ones--;
                else return zeros;
            }
        }

        return 0;
    }
}