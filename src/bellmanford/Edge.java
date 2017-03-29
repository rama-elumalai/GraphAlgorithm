package bellmanford;

/**
 * Created by luvra_000 on 3/28/2017.
 */
public class Edge {
    public double weight;
    public Vertex startingVertex;
    public Vertex targetVertex;

    public Edge(double weight, Vertex startingVertex, Vertex targetVertex) {
        this.weight = weight;
        this.startingVertex = startingVertex;
        this.targetVertex = targetVertex;
    }
}
