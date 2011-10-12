package org.sbolstandard.xml;

import java.net.URI;
import java.util.List;
import java.util.ArrayList;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "precedes")
public class PrecedeReference {

    @XmlAttribute(required = true)
    private URI uri = null;

    private SequenceAnnotationImpl sequenceAnnotation = null;

    public PrecedeReference(){}
    
    public PrecedeReference(SequenceAnnotationImpl sequenceAnnotation){
        this.setSequenceAnnotation(sequenceAnnotation);
    }

    public SequenceAnnotationImpl getSequenceAnnotation(){ return sequenceAnnotation; }
    public void setSequenceAnnotation(SequenceAnnotationImpl sequenceAnnotation){
        this.uri = sequenceAnnotation.getURI();
        this.sequenceAnnotation = sequenceAnnotation;
    }

    // The remaining methods are to be used only by the XML marshalling engine
    public URI getURI(){ return this.uri; }
    public void setURI(URI uri) { this.uri = uri; this.sequenceAnnotation = null; }
}