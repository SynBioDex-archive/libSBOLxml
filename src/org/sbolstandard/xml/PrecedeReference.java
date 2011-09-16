package org.sbolstandard.xml;

import java.util.List;
import java.util.ArrayList;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "precedes")
public class PrecedeReference {

    @XmlAttribute(required = true)
    private String id = null;

    private SequenceAnnotationImpl sequenceAnnotation = null;

    public PrecedeReference(){}
    
    public PrecedeReference(SequenceAnnotationImpl sequenceAnnotation){
        this.setSequenceAnnotation(sequenceAnnotation);
    }

    public SequenceAnnotationImpl getSequenceAnnotation(){ return sequenceAnnotation; }
    public void setSequenceAnnotation(SequenceAnnotationImpl sequenceAnnotation){
        this.id = sequenceAnnotation.getId();
        this.sequenceAnnotation = sequenceAnnotation;
    }

    // The remaining methods are to be used only by the XML marshalling engine
    public String getId(){ return this.id; }
    public void setId(String id) { this.id = id; this.sequenceAnnotation = null; }
}