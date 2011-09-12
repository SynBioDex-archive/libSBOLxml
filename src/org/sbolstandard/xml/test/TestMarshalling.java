package org.sbolstandard.xml.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.sbolstandard.xml.*;

public class TestMarshalling {
	
	public CollectionImpl generateCollection(){
		CollectionImpl collection = new CollectionImpl();
		collection.setDisplayId("collection-id-1234");
		collection.setName("Simple");
		collection.setDescription("This was generated during the test run.");

		DnaComponentImpl dnaComponent = new DnaComponentImpl();
		dnaComponent.setDisplayId("component-id-4321");
		collection.getComponent().add(dnaComponent);

		dnaComponent = new DnaComponentImpl();
		dnaComponent.setDisplayId("component-id-4444");
		DnaSequenceImpl sequence = new DnaSequenceImpl();
		sequence.setNucleotides("gatica");
		dnaComponent.setSequence(sequence);
		SequenceAnnotationImpl annotation = new SequenceAnnotationImpl();
		annotation.setId("annotation-id-5422");
		annotation.setGenbankStart(1);
		annotation.setEnd(100);
		dnaComponent.getAnnotation().add(annotation);
		collection.getComponent().add(dnaComponent);
		
		return collection;
	}
	
	@Test
	public void testSerialize() throws Exception {
		Parser parser = new Parser();
		CollectionImpl collection = generateCollection();
		String xml = parser.serialize(collection);
		assertNotNull(xml);

		System.out.println(xml);
		
		CollectionImpl collection2 = parser.parse(xml);
		assertNotNull(collection2);
		assertEquals(collection.getDisplayId(), collection2.getDisplayId());
	}
	
	@Test
	public void testParser() throws Exception {
		Parser parser = new Parser();
		CollectionImpl collection = parser.parse("<Collection />");
		assertNotNull(collection);
	}
}