package api;

import graph.VisGraph;
import gui.GraphView;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class VisFx{

    public static void graphNetwork(VisGraph graph , Stage mainStage){
        GraphView graphView = new GraphView(graph);
        Platform.runLater(() -> graphView.start(mainStage));
    }

}
