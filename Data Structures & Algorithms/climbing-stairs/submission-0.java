class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n== 1) return 1;

        int n_1 = 2;
        int n_2 = 1;

        for(int i = 2; i < n; i++){
            int temp = n_1;
            n_1 = n_1 + n_2;
            n_2 = temp;
        }


        return n_1;
    }
}


//recurrence