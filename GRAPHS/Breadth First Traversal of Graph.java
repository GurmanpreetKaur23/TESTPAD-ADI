/* The class is defined with below variables
class Graph { 
  private int V;
  private Map<Integer, List<Integer>> adjVertices;
  public Graph(int V) {
      this.V = V;
    this.adjVertices = new HashMap<Integer, List<Integer>>();
  }
  public void addVertex(int vertex) {
    adjVertices.putIfAbsent(vertex, new ArrayList<>());
  }
  public void addEdge(int src, int dest) {
    adjVertices.get(src).add(dest);
  }        */

void BFS(int v) 
{ 
Set<Integer> visited = new HashSet<>();

        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        
        // Start by marking the source vertex as visited and enqueue it
        visited.add(v);
        queue.offer(v);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");  // Print the visited vertex

            // Explore all adjacent vertices
            for (int neighbor : adjVertices.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }

