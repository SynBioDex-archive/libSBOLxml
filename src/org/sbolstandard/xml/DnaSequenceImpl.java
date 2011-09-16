package org.sbolstandard.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.sbolstandard.core.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DnaSequenceImpl", propOrder = { "nucleotides" })
public class DnaSequenceImpl implements DnaSequence{

    @XmlElement(required = true)
    protected String nucleotides = null;

    public DnaSequenceImpl(){ this(null); }

    public DnaSequenceImpl(String nucleotides) { this.nucleotides = nucleotides; }

    public String getNucleotides() { return nucleotides; }
    public void setNucleotides(String value) { this.nucleotides = value; }

}
