//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.12 at 11:06:26 AM PDT 
//


package org.sbolstandard.xml;

import java.net.URI;
import java.util.List;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import org.sbolstandard.core.*;

/**
 * <p>Java class for DnaComponentImpl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DnaComponentImpl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sequence" type="{}DnaSequenceImpl" minOccurs="0"/>
 *         &lt;element name="annotation" type="{}SequenceAnnotationImpl" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="displayId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isCircular" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DnaComponentImpl", propOrder = {
    "type",
    "sequence",
    "annotation"
})
public class DnaComponentImpl implements DnaComponent {

    protected List<String> type = new ArrayList<String>();
    protected DnaSequenceImpl sequence = null;
    protected List<SequenceAnnotationImpl> annotation = new ArrayList<SequenceAnnotationImpl>();
    @XmlAttribute(required = true)
    protected String displayId = null;
    @XmlAttribute
    protected String name = null;
    @XmlAttribute
    protected String description = null;
    @XmlAttribute
    protected Boolean isCircular = true;

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getType() {
        return type;
    }

    public void addType(java.net.URI uri) {
        this.type.add(uri.toString());
    }

    public java.util.Collection<URI> getTypes() {
        ArrayList<URI> result = new ArrayList<URI>();
        for(int i=0; i < type.size(); i++){
            try{
                result.add(new URI(type.get(i)));
            } catch (java.net.URISyntaxException e){
                e.printStackTrace();
            }
        }
        return result;
    }

    public void setDnaSequence(org.sbolstandard.core.DnaSequence sequence){
        this.sequence = (DnaSequenceImpl)sequence;
    } 

    public DnaSequence getDnaSequence(){ return sequence; } 
    
    public void addAnnotation(SequenceAnnotation annotation) {
        this.annotation.add((SequenceAnnotationImpl)annotation);
    }
    
    public java.util.Collection<SequenceAnnotation> getAnnotations() {
        ArrayList<SequenceAnnotation> result = new ArrayList<SequenceAnnotation>();
        for(int i=0; i < annotation.size(); i++) result.add(annotation.get(i));
        return result;
    }
    
    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link DnaSequenceImpl }
     *     
     */
    public DnaSequenceImpl getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link DnaSequenceImpl }
     *     
     */
    public void setSequence(DnaSequenceImpl value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceAnnotationImpl }
     * 
     * 
     */
    public List<SequenceAnnotationImpl> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<SequenceAnnotationImpl>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the displayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayId() {
        return displayId;
    }

    /**
     * Sets the value of the displayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayId(String value) {
        this.displayId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isCircular property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCircular() {
        return isCircular;
    }

    /**
     * Sets the value of the isCircular property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCircular(Boolean value) {
        this.isCircular = value;
    }

}
