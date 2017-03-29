package bellmanford;

/**
 * Created by luvra_000 on 3/28/2017.
 */
public class DjisktraAlogrithm {

    public void computePath(Vertex sourceVertex) {
        sourceVertex.distance = 0;
        PriorityQueue<Vertex> queue = new PriorityQueue<>();

        queue.add(sourceVertex);

        while(!queue.isEmpty()) {
            //remove the first element of the Q or head of the Q
            Vertex vertex = queue.poll();
            for(Edge e : vertex.adjacenciesList) {
                Vertex v = e.targetVertex;
                Double newDistance = vertex.distance + e.weight;
                if(newDistance < v.distance) {
                    queue.remove(v);
                    v.distance = newDistance;
                    v.predecessor = vertex;
                    queue.add(v);
                }
            }
        }
    }

    public List<Vertex> getShortestPathTo(Vertex targetVertex) {
        List<Vertex> shortestPath = new ArrayList<>();
        for(Vertex vertex = targetVertex; vertex != null ; vertex = vertex.predecessor) {
            shortestPath.add(vertex);
        }
        Collections.reverse(shortestPath);
        return shortestPath;
    }
}
