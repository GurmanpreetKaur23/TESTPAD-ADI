
    // Utility function for DFS to visit vertices
    public void DFSUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : adjVertices.get(v)) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // DFS function to initialize visited array and start DFS
    public void DFS(int v) {
        // Create a visited array to keep track of visited vertices
        boolean[] visited = new boolean[adjVertices.size()];

        // Call the utility function to perform DFS starting from vertex v
        DFSUtil(v, visited);
    }



