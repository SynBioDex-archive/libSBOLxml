//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.02 at 10:42:33 AM PDT 
//


package src.org.sbolstandard.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DnaSequenceImpl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DnaSequenceImpl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nucleotides" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DnaSequenceImpl", propOrder = {
    "nucleotides"
})
public class DnaSequenceImpl {

    @XmlElement(required = true)
    protected String nucleotides;

    /**
     * Gets the value of the nucleotides property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNucleotides() {
        return nucleotides;
    }

    /**
     * Sets the value of the nucleotides property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNucleotides(String value) {
        this.nucleotides = value;
    }

}
