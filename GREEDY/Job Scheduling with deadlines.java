class Result {
  static int jobScheduling(int[] deadlines, int[] profits) {
 int n = deadlines.length;
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadlines[i]; 
            jobs[i][1] = profits[i];  
        }
        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);
        boolean[] schedule = new boolean[101]; 
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            int deadline = jobs[i][0];
            int profit = jobs[i][1];
            for (int j = deadline; j > 0; j--) {
                if (!schedule[j]) {
                    schedule[j] = true; 
                    maxProfit += profit; 
                    break; 
                }
            }
        }
       return maxProfit;
  }
}
