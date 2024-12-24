class Result {
  static void heapify(int array[], int n, int i) {
    int largest = i; // Initialize largest as root
    int left = 2 * i + 1; // Left child
    int right = 2 * i + 2; // Right child

    // Check if left child is larger than root
    if (left < n && array[left] > array[largest]) {
      largest = left;
    }

    // Check if right child is larger than the largest so far
    if (right < n && array[right] > array[largest]) {
      largest = right;
    }

    // If the largest is not root
    if (largest != i) {
      // Swap root with the largest
      int temp = array[i];
      array[i] = array[largest];
      array[largest] = temp;

      // Recursively heapify the affected subtree
      heapify(array, n, largest);
    }
  }

  static void heapSort(int array[], int n) {
    // Build the max heap
    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(array, n, i);
    }

    // Extract elements one by one from the heap
    for (int i = n - 1; i >= 0; i--) {
      // Move current root to the end
      int temp = array[0];
      array[0] = array[i];
      array[i] = temp;

      // Call heapify on the reduced heap
      heapify(array, i, 0);
    }
  }
}
