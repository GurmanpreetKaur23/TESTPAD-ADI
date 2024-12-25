class Result {
    static int intervalScheduling(int[] start, int[] end) {
        int n = start.length;

        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = start[i];  
            intervals[i][1] = end[i];    
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;  
        int lastEndTime = intervals[0][1]; 

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= lastEndTime) {
                count++;  
                lastEndTime = intervals[i][1];
            }
        }

        return count;
    }

}
