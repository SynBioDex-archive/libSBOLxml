package org.sbolstandard.xml;

import java.net.URI;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import org.sbolstandard.core.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DnaSequenceImpl", propOrder = { "nucleotides" })
public class DnaSequenceImpl implements DnaSequence{

    @XmlAttribute(required = true)
    protected URI uri = null;
    @XmlElement(required = true)
    protected String nucleotides = null;

    public DnaSequenceImpl(){ this(null, null); }

    public DnaSequenceImpl(URI uri, String nucleotides) {
		this.uri = uri;
		this.nucleotides = nucleotides;
	}

    public URI getURI(){ return this.uri; }
    public void setURI(URI uri){ this.uri = uri; }

    public String getNucleotides() { return nucleotides; }
    public void setNucleotides(String value) { this.nucleotides = value; }

}
