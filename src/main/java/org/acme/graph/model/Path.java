package org.acme.graph.model;

import java.util.ArrayList;
import java.util.List;

public class Path {

    private List<Edge> edges = new ArrayList<>();

    public Path(List<Edge> edges) {
        this.edges = edges;
    }
    
    public List<Edge> getEdges() {
        return edges;
    }

    /**
     * Calculer la longueur des edges
     * 
     * @return double
     */
    public double getLength() {
        double length = 0;
        for (Edge edge : this.edges) {
            length += edge.getCost();
        }
        return length;
    }
}