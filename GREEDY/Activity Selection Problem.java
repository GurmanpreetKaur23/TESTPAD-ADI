class Result {
    static void activitySelection(int[] start, int[] finish) {
        int n = start.length;

        // Pair start and finish times and sort by finish times
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;
        Arrays.sort(indices, (a, b) -> Integer.compare(finish[a], finish[b]));

        // Select activities
        int lastFinish = 0;
        StringBuilder result = new StringBuilder();
        for (int i : indices) {
            if (start[i] >= lastFinish) {
                result.append(start[i]).append(" ");
                lastFinish = finish[i];
            }
        }

        System.out.println(result.toString().trim());
    }
}
