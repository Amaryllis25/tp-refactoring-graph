package org.acme.graph.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;
import org.locationtech.jts.geom.Coordinate;

public class EdgeTest {
	
    @Test
	public void testDefaultConstructor(){

        Vertex vertex1 = new Vertex(new Coordinate(0.0, 0.0), "a");
        Vertex vertex2 = new Vertex(new Coordinate(1.0, 0.0), "b");
		Edge e = new Edge(vertex1, vertex2);
		Assert.assertEquals(vertex1, e.getSource());
		Assert.assertEquals(vertex2, e.getTarget());
	}
}
