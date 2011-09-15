package org.sbolstandard.xml.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.sbolstandard.xml.*;
import org.sbolstandard.core.*;

public class TestMarshalling {
	
	public CollectionImpl generateExample1Collection(){
		CollectionImpl collection = new CollectionImpl();
		collection.setDisplayId("Example 1 Collection");
		collection.setDescription("A simple example collection");
        
		DnaComponentImpl dnaComponent = new DnaComponentImpl();
		dnaComponent.setDisplayId("apFAB1");
		dnaComponent.setDescription("J23101");
		DnaSequenceImpl sequence = new DnaSequenceImpl();
		sequence.setNucleotides("TTTACAGCTAGCTCAGTCCTAGGTATTATGCTAGC");
	    dnaComponent.setDnaSequence(sequence);
		collection.addComponent(dnaComponent);

		return collection;
	}
	
	public CollectionImpl generateExample2Collection(){
		CollectionImpl collection = new CollectionImpl();
		collection.setDisplayId("Example 2 Collection");
		collection.setDescription("Another simple example collection");

		DnaComponentImpl dnaComponent = new DnaComponentImpl("pFAB21", null, "pFAB21_J23101_Anderson_RBS");
		dnaComponent.addType("http://sbols.org/sbol.owl#plasmid");
		collection.addComponent(dnaComponent);

		dnaComponent = new DnaComponentImpl("pFAB22", null, "pFAB22_J23101_Bujard_RBS");
		dnaComponent.addType("http://sbols.org/sbol.owl#plasmid");
		collection.addComponent(dnaComponent);

		dnaComponent = new DnaComponentImpl("pFAB23", null, "pFAB23_J23101_B0030_RBS");
		dnaComponent.addType("http://sbols.org/sbol.owl#plasmid");
		collection.addComponent(dnaComponent);

		return collection;
	}
	
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
	
	public void assertEqual(CollectionImpl collection1, CollectionImpl collection2) throws Exception{
	    assertNotNull(collection1);
		assertNotNull(collection2);
		assertEquals(collection1.getDisplayId(), collection2.getDisplayId());
		assertEquals(collection1.getName(), collection2.getName());
		assertEquals(collection1.getDescription(), collection2.getDescription());
		
	}
	
	public void assertEqual(DnaComponentImpl component1, DnaComponentImpl component2){
	    assertEquals(component1.getDisplayId(), component2.getDisplayId());
		//TODO fill this out more
	}

    public void assertSerializationEquality(CollectionImpl collection) throws Exception {
		Parser parser = new Parser();
		String xml = parser.serialize(collection);
		assertNotNull(xml);
		System.out.println(xml);
		CollectionImpl collection2 = parser.parse(xml);
        assertEqual(collection, collection2);
    }
	
	@Test
	public void testSerialize() throws Exception {
	    assertSerializationEquality(generateExample1Collection());
	    assertSerializationEquality(generateExample2Collection());
	}
}