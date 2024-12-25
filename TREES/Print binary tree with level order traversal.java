/*
 * class Node {
 *   int data;
 *   Node left;
 *   Node right;
 *   public Node() { data = 0; }
 *   public Node(int d) { data = d; }
 * }
 */

public static void printLevelWise(Node root) {
    if (root == null) return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int size = queue.size(); // Number of nodes at the current level
        for (int i = 0; i < size; i++) {
            Node current = queue.poll();
            System.out.print(current.data + (i < size - 1 ? " " : ""));
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println(); // Move to the next level
    }
}
