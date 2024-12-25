class Result {
    static double fractionalKnapsack(int val[], int weight[], int n, int capacity) {
        double[][] items = new double[n][2];
        for (int i = 0; i < n; i++) {
            items[i][0] = (double) val[i] / weight[i]; 
            items[i][1] = i; 
        }

        Arrays.sort(items, (a, b) -> Double.compare(b[0], a[0]));

        double maxValue = 0.0;
        for (int i = 0; i < n; i++) {
            int index = (int) items[i][1];
            if (weight[index] <= capacity) {
                maxValue += val[index]; 
                capacity -= weight[index];
            } else {
                maxValue += items[i][0] * capacity; 
                break;
            }
        }

        return maxValue;
    }
}
