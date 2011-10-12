package org.sbolstandard.xml;

import java.net.URI;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import org.sbolstandard.core.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DnaComponentImpl", propOrder = { "type", "sequence", "annotation" })
public class DnaComponentImpl implements DnaComponent {

    @XmlAttribute(required = true)
    protected URI uri = null;
    protected List<String> type = new ArrayList<String>();
    protected DnaSequenceImpl sequence = null;
    protected List<SequenceAnnotationImpl> annotation = new ArrayList<SequenceAnnotationImpl>();
    @XmlAttribute
    protected String displayId = null;
    @XmlAttribute
    protected String name = null;
    @XmlAttribute
    protected String description = null;

    public DnaComponentImpl(){
        this(null, null, null, null);
    }

    public DnaComponentImpl(URI uri, String displayId, String name, String description){
        this.uri = uri;
        this.displayId = displayId;
        this.name = name;
        this.description = description;
    }

    public URI getURI(){ return this.uri; }
    public void setURI(URI uri){ this.uri = uri; }

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
    public void addType(String uri){ this.type.add(uri); }
    public void addType(java.net.URI uri) { this.type.add(uri.toString()); }

    public DnaSequence getDnaSequence(){ return sequence; } 
    public void setDnaSequence(DnaSequence sequence){ this.sequence = (DnaSequenceImpl)sequence; } 

    public java.util.Collection<SequenceAnnotation> getAnnotations() {
        ArrayList<SequenceAnnotation> result = new ArrayList<SequenceAnnotation>();
        for(int i=0; i < annotation.size(); i++) result.add(annotation.get(i));
        return result;
    }
    public void addAnnotation(SequenceAnnotation annotation) {
        this.annotation.add((SequenceAnnotationImpl)annotation);
    }
    
    public DnaSequenceImpl getSequence() { return sequence; }
    public void setSequence(DnaSequenceImpl value) { this.sequence = value; }

    public String getDisplayId() { return displayId; }
    public void setDisplayId(String value) { this.displayId = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }
    
    /*
    * Below here are methods used by the XML system but not humans.
    */
    public List<String> getType() {
        return type;
    }

    public List<SequenceAnnotationImpl> getAnnotation() { return this.annotation; }
    
    public void cleanupPostParse(CollectionImpl collection){
        Iterator iter = annotation.iterator();
        while(iter.hasNext()){
            ((SequenceAnnotationImpl)iter.next()).cleanupPostParse(collection, this);
        }
    }
    
    public SequenceAnnotationImpl getSequenceAnnotation(String id){
        Iterator iter = annotation.iterator();
        while(iter.hasNext()){
            SequenceAnnotationImpl sa = ((SequenceAnnotationImpl)iter.next());
            if(sa.getId().equals(id)) return sa;
        }
        return null;
    }
}
