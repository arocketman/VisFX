package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class VisNodeTest {

    @Test
    public void toJson() {
        VisNode node1 = new VisNode(1,"node1");
        assertEquals("{\"id\":1,\"label\":\"node1\"}",node1.toJson());
    }
}