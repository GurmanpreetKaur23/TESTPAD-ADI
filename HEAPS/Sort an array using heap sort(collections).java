import java.util.Collections;
import java.util.PriorityQueue;

class Result {
  static void heapify(int array[], int n, int i) {
    // Not required when using PriorityQueue for sorting.
  }

  static void heapSort(int array[], int n) {
    // Use a max heap (PriorityQueue in ascending order)
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    
    // Add all elements to the max heap
    for (int i = 0; i < n; i++) {
      maxHeap.offer(array[i]);
    }

    // Poll elements from the max heap to get sorted order
    for (int i = 0; i < n; i++) {
      array[i] = maxHeap.poll();
    }
  }
}
