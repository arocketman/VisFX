package graph;

import com.google.gson.GsonBuilder;
import jsonutils.VisEdgeAdapter;

public class VisEdge {
    private VisNode from;
    private VisNode to;
    private String arrows;
    private String label;

    public VisEdge(VisNode from, VisNode to, String arrows, String label) {
        this.from = from;
        this.to = to;
        this.arrows = arrows;
        this.label = label;
    }

    public String toJson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(VisEdge.class,new VisEdgeAdapter());
        return gsonBuilder.create().toJson(this);
    }

    public VisNode getFrom() {
        return from;
    }

    public void setFrom(VisNode from) {
        this.from = from;
    }

    public VisNode getTo() {
        return to;
    }

    public void setTo(VisNode to) {
        this.to = to;
    }

    public String getArrows() {
        return arrows;
    }

    public void setArrows(String arrows) {
        this.arrows = arrows;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
