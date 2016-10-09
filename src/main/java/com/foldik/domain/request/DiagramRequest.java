package com.foldik.domain.request;

import java.util.List;

public class DiagramRequest {

    private Label label;
    private List<Point> data;

    public DiagramRequest() {
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public List<Point> getData() {
        return data;
    }

    public void setData(List<Point> data) {
        this.data = data;
    }
}
