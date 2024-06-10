package PERTEMUAN15;

public class GraphMatriks21 {
    private final int[][] adjMatrix;
    private final int numVertices;

    public GraphMatriks21(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    public void makeEdge(int i, int j, int weight) {
        adjMatrix[i][j] = weight;
        adjMatrix[j][i] = weight;
    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }

    public void printGraph21() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (int j = 0; j < numVertices; j++) {
                if (adjMatrix[i][j] > 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    
    // Modifikasi
    private boolean DFSUtil(int v, int dest, boolean[] visited) {
        visited[v] = true;
        if (v == dest) return true;
        for (int i = 0; i < numVertices; i++) {
            if (adjMatrix[v][i] > 0 && !visited[i]) {
                if (DFSUtil(i, dest, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isReachable(int src, int dest) {
        boolean[] visited = new boolean[numVertices];
        return DFSUtil(src, dest, visited);
    }
}

