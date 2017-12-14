package examples;

import api.VisFx;
import graph.VisEdge;
import graph.VisGraph;
import graph.VisNode;
import javafx.application.Application;
import javafx.stage.Stage;

public class ComplexGraph extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VisFx.graphNetwork(getDummyGraph(),primaryStage);
    }

    private VisGraph getDummyGraph(){
        VisGraph graph = new VisGraph();
        VisNode father = new VisNode(1,"Mike");
        VisNode mother = new VisNode(2,"Delia");
        VisNode firstSon = new VisNode(3,"Tim");
        VisNode secondSon = new VisNode(4,"Andrew");
        VisNode firstDaughter = new VisNode(5,"Gina");
        VisNode firstSonSon = new VisNode(6,"Luke");
        VisEdge edge1 = new VisEdge(father,mother,"to;from","married");
        VisEdge edge2 = new VisEdge(father,firstSon,"to","father_to");
        VisEdge edge3 = new VisEdge(father,secondSon,"to","father_to");
        VisEdge edge4 = new VisEdge(father,firstDaughter,"to","father_to");
        VisEdge edge5 = new VisEdge(mother,firstSon,"to","mother_to");
        VisEdge edge6 = new VisEdge(mother,secondSon,"to","mother_to");
        VisEdge edge7 = new VisEdge(mother,firstDaughter,"to","mother_to");
        graph.addNodes(father,mother,firstSon,secondSon,firstDaughter,firstSonSon);
        graph.addEdges(edge1,edge2,edge3,edge4,edge5,edge6,edge7);
        return graph;
    }
}
