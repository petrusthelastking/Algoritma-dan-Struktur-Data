package PERTEMUAN15;

import org.w3c.dom.Node;

public class Graph21 {
    int vertex;
    DoubleLinkedLists list[];

    public Graph21(int v) {
        vertex = v;
        list = new DoubleLinkedLists[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        //list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            totalOut = list[asal].size();
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph21() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i));
                System.out.println("Gedung " + (char) ('A' + i) + " Terhubung dengan");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].get(j) + " m), ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    private boolean DFSUtil(int v, int dest, boolean visited[]) {
        visited[v] = true;
        if (v == dest) return true;
        for (int i = 0; i < list[v].size(); i++) {
            int n = list[v].get(i);
            if (!visited[n]) {
                if (DFSUtil(n, dest, visited))
                    return true;
            }
        }
        return false;
    }

    boolean isReachable(int src, int dest) {
        boolean visited[] = new boolean[vertex];
        return DFSUtil(src, dest, visited);
    }

    public void addVertex(int numNewVertices) {
        int oldNumVertices = vertex;
        vertex += numNewVertices;

        DoubleLinkedLists[] newList = new DoubleLinkedLists[vertex];
        System.arraycopy(list, 0, newList, 0, oldNumVertices);

        for (int i = oldNumVertices; i < vertex; i++) {
            newList[i] = new DoubleLinkedLists();
        }

        list = newList;

        System.out.println("Jumlah gedung berhasil ditambahkan menjadi " + vertex);
    }
    public int hitungEdge() {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            count += list[i].size();
        }
        return count;
    }
}



