//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.02 at 10:42:33 AM PDT 
//


package src.org.sbolstandard.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the src.org.sbolstandard.xml package. 
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

    private final static QName _SequenceAnnotationImplPrecedes_QNAME = new QName("", "precedes");
    private final static QName _DnaSequenceImpl_QNAME = new QName("", "DnaSequenceImpl");
    private final static QName _DnaComponentImpl_QNAME = new QName("", "DnaComponentImpl");
    private final static QName _CollectionImpl_QNAME = new QName("", "CollectionImpl");
    private final static QName _SequenceAnnotationImpl_QNAME = new QName("", "SequenceAnnotationImpl");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: src.org.sbolstandard.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SequenceAnnotationImpl }
     * 
     */
    public SequenceAnnotationImpl createSequenceAnnotationImpl() {
        return new SequenceAnnotationImpl();
    }

    /**
     * Create an instance of {@link CollectionImpl }
     * 
     */
    public CollectionImpl createCollectionImpl() {
        return new CollectionImpl();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "precedes", scope = SequenceAnnotationImpl.class)
    @XmlIDREF
    public JAXBElement<Object> createSequenceAnnotationImplPrecedes(Object value) {
        return new JAXBElement<Object>(_SequenceAnnotationImplPrecedes_QNAME, Object.class, SequenceAnnotationImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DnaSequenceImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DnaSequenceImpl")
    public JAXBElement<DnaSequenceImpl> createDnaSequenceImpl(DnaSequenceImpl value) {
        return new JAXBElement<DnaSequenceImpl>(_DnaSequenceImpl_QNAME, DnaSequenceImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DnaComponentImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DnaComponentImpl")
    public JAXBElement<DnaComponentImpl> createDnaComponentImpl(DnaComponentImpl value) {
        return new JAXBElement<DnaComponentImpl>(_DnaComponentImpl_QNAME, DnaComponentImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CollectionImpl")
    public JAXBElement<CollectionImpl> createCollectionImpl(CollectionImpl value) {
        return new JAXBElement<CollectionImpl>(_CollectionImpl_QNAME, CollectionImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceAnnotationImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SequenceAnnotationImpl")
    public JAXBElement<SequenceAnnotationImpl> createSequenceAnnotationImpl(SequenceAnnotationImpl value) {
        return new JAXBElement<SequenceAnnotationImpl>(_SequenceAnnotationImpl_QNAME, SequenceAnnotationImpl.class, null, value);
    }

}
