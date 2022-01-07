package org.acme.graph.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.acme.graph.TestGraphFactory;
import org.junit.Assert;
import org.junit.Test;
import org.locationtech.jts.geom.Coordinate;

public class PathTest {

    public static final double EPSILON = 1.0e-15;
    
    @Test
	public void testGetLength(){
        Graph graph = TestGraphFactory.createGraph01();
        Vertex vertex = graph.findVertex("a");
        Path path = new Path(graph.getInEdges(vertex));
		Assert.assertEquals(0, path.getLength(), EPSILON);
	}
}