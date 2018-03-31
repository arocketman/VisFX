package graph;

import com.google.gson.Gson;
import jsonutils.VisEdgeAdapter;

import javax.management.relation.Relation;
import java.io.*;
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

    public boolean containsNode(long offset) {
        return this.nodes.containsKey(offset);
    }

    public VisNode getNode(long id){
        return this.nodes.get(id);
    }

    public void saveAsSif(String destFile){
        BufferedWriter fos = null;
        try {
            fos = new BufferedWriter(new FileWriter(new File(destFile)));
            for(VisEdge visEdge : edges){
                fos.write(visEdge.getFrom().getLabel() + " " + visEdge.getLabel() + " " + visEdge.getTo().getLabel() + "\n");
                fos.flush();
            }
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
