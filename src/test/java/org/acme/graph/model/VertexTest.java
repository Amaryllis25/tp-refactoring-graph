package org.acme.graph.model;

import org.junit.Assert;
import org.junit.Test;
import org.locationtech.jts.geom.Coordinate;

public class VertexTest {
	
    @Test
	public void testDefaultConstructor(){

        Vertex vertex = new Vertex(new Coordinate(0.0, 0.0), "a");
		Assert.assertEquals("a", vertex.getId());
	} 
    
}
