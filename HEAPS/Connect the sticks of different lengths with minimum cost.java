import java.util.PriorityQueue;

class Result {
    static int connectCost(int[] sticks, int n) {
        // Create a min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all stick lengths to the heap
        for (int stick : sticks) {
            minHeap.add(stick);
        }

        int totalCost = 0;

        // Keep combining the two smallest sticks
        while (minHeap.size() > 1) {
            int first = minHeap.poll(); // Smallest stick
            int second = minHeap.poll(); // Second smallest stick
            int cost = first + second; // Cost to combine
            totalCost += cost; // Add to total cost
            minHeap.add(cost); // Add the combined stick back to the heap
        }

        return totalCost; // Return the total cost
    }
}
