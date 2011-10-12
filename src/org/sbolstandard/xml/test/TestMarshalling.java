package org.sbolstandard.xml.test;

import java.net.URI;
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
		CollectionImpl collection = new CollectionImpl(UtilURI.Create("/col/1"), "collection-id-1234", "Complete Collection", "This was generated during the test run.");

		DnaComponentImpl dnaComponent = new DnaComponentImpl(UtilURI.Create("/comp/1"), "component-id-4321", "DnaComponent 4321", "A Component");
		collection.getComponent().add(dnaComponent);

		dnaComponent = new DnaComponentImpl(UtilURI.Create("/test/2"), "component-id-4444", "DnaComponent 4444", "A Component");
		collection.getComponent().add(dnaComponent);
		dnaComponent.setSequence(new DnaSequenceImpl(UtilURI.Create("/seq/1"), "gataca"));
		SequenceAnnotationImpl annotation = new SequenceAnnotationImpl(UtilURI.Create("/anno/1"));
		dnaComponent.addAnnotation(annotation);
		annotation.setBioStart(1);
		annotation.setBioEnd(50);
		annotation.setSubComponent(dnaComponent);
		SequenceAnnotationImpl annotation2 = new SequenceAnnotationImpl(UtilURI.Create("/anno/2"));
		dnaComponent.addAnnotation(annotation2);
		annotation2.setBioStart(50);
		annotation2.setBioEnd(900);
		annotation2.setStrand("+");
		annotation2.addPrecede(annotation);
		annotation2.addPrecede(annotation2); // This is a circular reference
		annotation2.setSubComponent(dnaComponent);
		
		return collection;
	}
	
	public CollectionImpl generateExample1Collection(){
		CollectionImpl collection = new CollectionImpl(UtilURI.Create("/col/2"), "example-1-collection", "Example 1 Collection", "A simple example collection");
        
		DnaComponentImpl dnaComponent = new DnaComponentImpl(UtilURI.Create("/comp/23"), "apFAB1", "apFAB1", "J23101");
		DnaSequenceImpl sequence = new DnaSequenceImpl();
		sequence.setURI(UtilURI.Create("/seq/23"));
		sequence.setNucleotides("TTTACAGCTAGCTCAGTCCTAGGTATTATGCTAGC");
	    dnaComponent.setDnaSequence(sequence);
		collection.addComponent(dnaComponent);

		return collection;
	}
	
	public CollectionImpl generateExample2Collection(){
		CollectionImpl collection = new CollectionImpl(UtilURI.Create("/col/233"), "example-2-collection", "Example 2 Collection", "A simple example collection");

		DnaComponentImpl dnaComponent = new DnaComponentImpl(UtilURI.Create("/comp/4555"), "pFAB21", null, "pFAB21_J23101_Anderson_RBS");
		dnaComponent.addType("http://sbols.org/sbol.owl#plasmid");
		collection.addComponent(dnaComponent);

		dnaComponent = new DnaComponentImpl(UtilURI.Create("/comp/2322"), "pFAB22", null, "pFAB22_J23101_Bujard_RBS");
		dnaComponent.addType("http://sbols.org/sbol.owl#plasmid");
		collection.addComponent(dnaComponent);

		dnaComponent = new DnaComponentImpl(UtilURI.Create("/comp/11123"), "pFAB23", null, "pFAB23_J23101_B0030_RBS");
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
	    
	    java.util.Collection<SequenceAnnotation> annotations1 = component1.getAnnotations();
	    java.util.Collection<SequenceAnnotation> annotations2 = component2.getAnnotations();
	    assertEquals(annotations1.size(), annotations2.size());
		Iterator iter1 = annotations1.iterator();
		Iterator iter2 = annotations2.iterator();
		while(iter1.hasNext()){
		    assertEqual((SequenceAnnotationImpl)iter1.next(), (SequenceAnnotationImpl)iter2.next());
		}
	}

    public void assertEqual(SequenceAnnotationImpl annotation1, SequenceAnnotationImpl annotation2){
        assertEquals(annotation1.getURI(), annotation2.getURI());
        assertEquals(annotation1.getBioStart(), annotation2.getBioStart());
        assertEquals(annotation1.getBioEnd(), annotation2.getBioEnd());
        assertEquals(annotation1.getStrand(), annotation2.getStrand());
        
        java.util.Collection<SequenceAnnotation> precedes1 = annotation1.getPrecedes();
        java.util.Collection<SequenceAnnotation> precedes2 = annotation2.getPrecedes();
        assertEquals(precedes1.size(), precedes2.size());
		Iterator iter1 = precedes1.iterator();
		Iterator iter2 = precedes2.iterator();
		while(iter1.hasNext()){
		    SequenceAnnotationImpl sa1 = (SequenceAnnotationImpl)iter1.next();
		    assertNotNull(sa1);
		    SequenceAnnotationImpl sa2 = (SequenceAnnotationImpl)iter2.next();
		    assertNotNull(sa2);
		    assertEquals(sa1.getURI(), sa2.getURI());
		}
        
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