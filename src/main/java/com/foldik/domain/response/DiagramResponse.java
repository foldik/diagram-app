package com.foldik.domain.response;

public class DiagramResponse {

    private String svg;

    public DiagramResponse() {
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiagramResponse that = (DiagramResponse) o;

        return svg != null ? svg.equals(that.svg) : that.svg == null;

    }

    @Override
    public int hashCode() {
        return svg != null ? svg.hashCode() : 0;
    }
}
