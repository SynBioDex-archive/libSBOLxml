//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.12 at 11:06:26 AM PDT 
//


package org.sbolstandard.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sbolstandard.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Collection_QNAME = new QName("", "Collection");
    private final static QName _SequenceAnnotation_QNAME = new QName("", "SequenceAnnotation");
    private final static QName _DnaComponent_QNAME = new QName("", "DnaComponent");
    private final static QName _DnaSequence_QNAME = new QName("", "DnaSequence");
    private final static QName _SequenceAnnotationImplPrecedes_QNAME = new QName("", "precedes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sbolstandard.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CollectionImpl }
     * 
     */
    public CollectionImpl createCollectionImpl() {
        return new CollectionImpl();
    }

    /**
     * Create an instance of {@link SequenceAnnotationImpl }
     * 
     */
    public SequenceAnnotationImpl createSequenceAnnotationImpl() {
        return new SequenceAnnotationImpl();
    }

    /**
     * Create an instance of {@link DnaComponentImpl }
     * 
     */
    public DnaComponentImpl createDnaComponentImpl() {
        return new DnaComponentImpl();
    }

    /**
     * Create an instance of {@link DnaSequenceImpl }
     * 
     */
    public DnaSequenceImpl createDnaSequenceImpl() {
        return new DnaSequenceImpl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Collection")
    public JAXBElement<CollectionImpl> createCollection(CollectionImpl value) {
        return new JAXBElement<CollectionImpl>(_Collection_QNAME, CollectionImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceAnnotationImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SequenceAnnotation")
    public JAXBElement<SequenceAnnotationImpl> createSequenceAnnotation(SequenceAnnotationImpl value) {
        return new JAXBElement<SequenceAnnotationImpl>(_SequenceAnnotation_QNAME, SequenceAnnotationImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DnaComponentImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DnaComponent")
    public JAXBElement<DnaComponentImpl> createDnaComponent(DnaComponentImpl value) {
        return new JAXBElement<DnaComponentImpl>(_DnaComponent_QNAME, DnaComponentImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DnaSequenceImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DnaSequence")
    public JAXBElement<DnaSequenceImpl> createDnaSequence(DnaSequenceImpl value) {
        return new JAXBElement<DnaSequenceImpl>(_DnaSequence_QNAME, DnaSequenceImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "precedes", scope = SequenceAnnotationImpl.class)
    @XmlIDREF
    public JAXBElement<Object> createSequenceAnnotationImplPrecedes(Object value) {
        return new JAXBElement<Object>(_SequenceAnnotationImplPrecedes_QNAME, Object.class, SequenceAnnotationImpl.class, value);
    }

}