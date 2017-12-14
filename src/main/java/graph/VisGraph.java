package graph;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import jsonutils.VisEdgeAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class VisGraph {

    private HashMap<Long,VisNode> nodes;
    private ArrayList<VisEdge> edges;

    public VisGraph(){
        nodes = new HashMap<>();
        edges = new ArrayList<>();
    }

    public VisGraph(ArrayList<VisNode> nodes, ArrayList<VisEdge> edges){
        this.edges = edges;
        for(VisNode node : nodes)
            this.nodes.put(node.getId(),node);
    }

    public void addNodes(VisNode ... nodes){
        for(VisNode node : nodes)
            this.nodes.put(node.getId(),node);
    }

    public void addEdges(VisEdge ... edges){
        this.edges.addAll(Arrays.asList(edges));
    }

    public ArrayList<VisNode> nodesAsList(){
        return new ArrayList<>(nodes.values());
    }

    public String getNodesJson(){
        Gson gson = new Gson();
        return gson.toJson(nodesAsList());
    }

    public String getEdgesJson(){
        return VisEdgeAdapter.getAsJsonArray(edges).toString();
    }

}
