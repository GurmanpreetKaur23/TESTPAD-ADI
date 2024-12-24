
static void printKLargest(int array[], int n, int k) {
    // Sort the array in descending order
    Arrays.sort(array);
    for (int i = n - 1; i >= n - k; i--) {
        System.out.print(array[i] + (i > n - k ? " " : ""));
    }
}
