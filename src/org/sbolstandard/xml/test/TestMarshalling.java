package org.sbolstandard.xml.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.sbolstandard.xml.*;

public class TestMarshalling {
	
	@Test
	public void testSerialize() throws Exception {
		Parser parser = new Parser();
		CollectionImpl collection = parser.parse("<CollectionImpl />");
		assertNotNull(collection);
	}
}