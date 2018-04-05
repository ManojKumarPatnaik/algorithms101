package algorithms;

import org.junit.Before;
import org.junit.Test;


public class BreadthFirstSearchGraphTest {

    private BreadthFirstSearchGraph g;

    @Before
    public void SetUp() throws Exception {
    }

    @Test
    public void SearchPrefix() throws Exception {

        g = new BreadthFirstSearchGraph(8);

        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(0, 6);

        g.addEdge(1, 0);
        g.addEdge(3, 0);
        g.addEdge(6, 0);

        g.addEdge(1, 4);
        g.addEdge(1, 5);

        g.addEdge(4, 1);
        g.addEdge(5, 1);

        g.addEdge(2, 5);
        g.addEdge(2, 7);
        g.addEdge(5, 2);
        g.addEdge(7, 2);

        g.addEdge(3, 5);
        g.addEdge(5, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(0);
    }

}
