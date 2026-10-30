class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<int[]>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();
        for (int[] e : edges)
            adj[e[0]].add(new int[]{e[1], e[2]});
        int[][] dist = new int[n][k + 1];
        for (int[] d : dist)
            Arrays.fill(d, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
       dist[0][1] = 0;
        pq.add(new int[]{0, 0, 1});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int cost = cur[0];
            int node = cur[1];
            int count = cur[2];
            if (cost != dist[node][count])   continue;
            if (node == n - 1) return cost;
            for (int[] next : adj[node]) {
                int v = next[0];
                int w = next[1];
                int newCount = labels.charAt(node) == labels.charAt(v)
                    ? count + 1 : 1;
                if (newCount <= k && cost + w < dist[v][newCount]) {
                    dist[v][newCount] = cost + w;
                    pq.add(new int[]{cost + w, v, newCount});
                }
            }
        }
        return -1;
    }
}