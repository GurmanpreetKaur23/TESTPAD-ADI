class Result {
    static void activitySelection(int[] start, int[] finish) {
        int n = start.length;
        int[][] activities = new int[n][2];

        // Combine start and finish times into a single array
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i]; // Start time
            activities[i][1] = finish[i]; // Finish time
        }

        // Sort activities by finish time
        Arrays.sort(activities, (a, b) -> Integer.compare(a[1], b[1]));

        int lastFinish = 0; // Keeps track of the end time of the last selected activity
        StringBuilder selectedActivities = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (activities[i][0] >= lastFinish) { // If the activity starts after the last one finishes
                selectedActivities.append(activities[i][0]).append(" ");
                lastFinish = activities[i][1]; // Update the end time of the last selected activity
            }
        }

        // Print the starting times of selected activities
        System.out.println(selectedActivities.toString().trim());
    }
}
