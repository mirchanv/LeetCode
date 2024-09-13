class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int employees = 0;

        for (int hour : hours) {
            if (hour >= target) employees++;
        }

        return employees;
    }
}