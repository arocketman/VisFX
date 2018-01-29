# VisFX
Easy to use access to vis.js network graph through javaFX, it uses JavaFX WebView to plot the results.

# Usage

You can check out the examples folder on the how to create simple graphs. Here's a simple way to create and plot the network:
```java
//Create the graph object
VisGraph graph = new VisGraph();
//Create the nodes
VisNode node1 = new VisNode(1,"a");
VisNode node2 = new VisNode(2,"b");
//Add an edge
VisEdge edge = new VisEdge(node1,node2,"to","part_of");
//Add nodes and edges to the graph.
graph.addNodes(node1,node2);
graph.addEdges(edge);
//Graph the network passing the graph itself and a JavaFX Stage.
VisFx.graphNetwork(graph,primaryStage);
```

# Preview

Here are some example graphs:

![Wordnet-post](https://i.imgur.com/lyrL4Pe.png)

![Wordnet-art](https://i.imgur.com/WgjWLRH.png)

Graphs are zoomable and nodes are movable just like the original vis.js


# Contributing
This project was born for personal purposes but feel free to fork it and extend it and send pull requests if you'd like.
