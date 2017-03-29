package bellmanford;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luvra_000 on 3/28/2017.
 */
public class Vertex implements Comparable<Vertex> {
    public String name;
    public List<Edge> adjacenciesList = new ArrayList<>();
    public boolean visited;
    public Vertex predecessor;
    public double distance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
    }

    public void addNeighbour(Edge e) {
        this.adjacenciesList.add(e);
    }

    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Vertex o) {
        return Double.compare(this.distance, o.distance);
    }
}
