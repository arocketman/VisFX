package graph;

import com.google.gson.Gson;

public class VisNode {
    private long id;
    private String label;

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public VisNode(long id, String label) {
        this.id = id;
        this.label = label;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
