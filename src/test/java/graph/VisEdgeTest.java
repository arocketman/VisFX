package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class VisEdgeTest {

    @Test
    public void toJson() {
        VisNode node1 = new VisNode(1,"a");
        VisNode node2 = new VisNode(2,"b");
        VisEdge edge = new VisEdge(node1,node2,"to","part_of");
        assertEquals("{\"from\":1,\"to\":2,\"label\":\"part_of\",\"dir\":\"to\"}",edge.toJson());
    }
}