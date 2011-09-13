//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.12 at 11:06:26 AM PDT 
//


package org.sbolstandard.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.sbolstandard.core.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceAnnotationImpl", propOrder = { "feature", "precede" })
public class SequenceAnnotationImpl implements SequenceAnnotation {

    protected List<DnaComponentImpl> feature = new ArrayList<DnaComponentImpl>();
    @XmlElementRef(name = "precede", type = JAXBElement.class)
    protected List<JAXBElement<Object>> precede = new ArrayList<JAXBElement<Object>>();
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id = null;
    @XmlAttribute(required = true)
    protected int genbankStart = 1;
    @XmlAttribute(required = true)
    protected int end = 1;
    @XmlAttribute(required = true)
    protected String strand = null;

    public java.util.Collection<SequenceAnnotation> getPrecedes(){
        ArrayList<SequenceAnnotation> result = new ArrayList<SequenceAnnotation>();
        for(int i=0; i < precede.size(); i++) result.add((SequenceAnnotation)precede.get(i));
        return result;
    }

    public void addPrecede(SequenceAnnotation precede) {
        assert false; // not yet implemented
        //this.precede.add((JAXBElement<Object>)precede);
    }


    public void addFeature(DnaComponent feature){
        this.feature.add((DnaComponentImpl)precede);
    }

    public java.util.Collection<DnaComponent> getFeatures(){
        ArrayList<DnaComponent> result = new ArrayList<DnaComponent>();
        for(int i=0; i < feature.size(); i++) result.add(feature.get(i));
        return result;
    }


    public List<DnaComponentImpl> getFeature() {
        return this.feature;
    }

    public List<JAXBElement<Object>> getPrecede() {
        return this.precede;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public int getGenbankStart() {
        return genbankStart;
    }

    public void setGenbankStart(int value) {
        this.genbankStart = value;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int value) {
        this.end = value;
    }

    public String getStrand() {
        return strand;
    }

    public void setStrand(String value) {
        this.strand = value;
    }

}
