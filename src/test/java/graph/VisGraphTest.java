package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class VisGraphTest {

    private VisGraph getDummyGraph(){
        VisGraph graph = new VisGraph();
        VisNode node1 = new VisNode(1,"a");
        VisNode node2 = new VisNode(2,"b");
        VisEdge edge = new VisEdge(node1,node2,"to","part_of");
        graph.addNodes(node1,node2);
        graph.addEdges(edge);
        return graph;
    }

    @Test
    public void nodesAsList() {
    }

    @Test
    public void getNodesJson() {
        System.out.println(getDummyGraph().getNodesJson());
    }

    @Test
    public void getEdgesJson() {
        System.out.println(getDummyGraph().getEdgesJson());
    }
}