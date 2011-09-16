package org.sbolstandard.xml.test;

import java.util.Iterator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.sbolstandard.xml.*;
import org.sbolstandard.core.*;

public class TestMarshalling {
	
	/*
	* Generate a CollectionImpl which exercises the core classes and methods.
	*/
	public CollectionImpl generateExampleCollection(){
		CollectionImpl collection = new CollectionImpl("collection-id-1234", "Complete Collection", "This was generated during the test run.");

		DnaComponentImpl dnaComponent = new DnaComponentImpl("component-id-4321", "DnaComponent 4321", "A Component");
		collection.getComponent().add(dnaComponent);

		dnaComponent = new DnaComponentImpl("component-id-4444", "DnaComponent 4444", "A Component");
		collection.getComponent().add(dnaComponent);
		DnaSequenceImpl sequence = new DnaSequenceImpl("gatica");
		dnaComponent.setSequence(sequence);
		SequenceAnnotationImpl annotation = new SequenceAnnotationImpl("annotation-id-5422");
		annotation.setGenbankStart(1);
		annotation.setEnd(100);
		dnaComponent.getAnnotation().add(annotation);
		
		return collection;
	}
	
	public CollectionImpl generateExample1Collection(){
		CollectionImpl collection = new CollectionImpl("example-1-collection", "Example 1 Collection", "A simple example collection");
        
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
		CollectionImpl collection = new CollectionImpl("example-2-collection", "Example 2 Collection", "A simple example collection");

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
	
	public void assertEqual(CollectionImpl collection1, CollectionImpl collection2) throws Exception{
	    assertNotNull(collection1);
		assertNotNull(collection2);
		assertEquals(collection1.getDisplayId(), collection2.getDisplayId());
		assertEquals(collection1.getName(), collection2.getName());
		assertEquals(collection1.getDescription(), collection2.getDescription());
		
		java.util.Collection<DnaComponent> components1 = collection1.getComponents();
		java.util.Collection<DnaComponent> components2 = collection2.getComponents();
		assertEquals(components1.size(), components2.size());
		Iterator iter1 = components1.iterator();
		Iterator iter2 = components2.iterator();
		while(iter1.hasNext()){
		    assertEqual((DnaComponentImpl)iter1.next(), (DnaComponentImpl)iter2.next());
		}
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
	    assertSerializationEquality(generateExampleCollection());
	    assertSerializationEquality(generateExample1Collection());
	    assertSerializationEquality(generateExample2Collection());
	}
}