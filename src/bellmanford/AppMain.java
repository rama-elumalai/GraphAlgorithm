package bellmanford;

/**
 * Created by luvra_000 on 3/28/2017.
 */
public class AppMain {

    public static void main (String[] args) {
        Vertex v0 = new Vertex("A");
        Vertex v1 = new Vertex("B");
        Vertex v2 = new Vertex("C");

        v0.addNeighbour(new Edge(1, v0, v1));
        v1.addNeighbour(new Edge(1, v1, v2));
        v0.addNeighbour(new Edge(1, v0, v2));

        DjisktraAlogrithm alogrithm = new DjisktraAlogrithm();
        alogrithm.computePath(v0);

        System.out.println(alogrithm.getShortestPathTo(v2));
    }
}
