package org.sbolstandard.xml;

import java.net.URI;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.*;

import org.sbolstandard.core.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionImpl", propOrder = { "component" })
@XmlRootElement(name = "Collection")
public class CollectionImpl implements Collection {

    protected List<DnaComponentImpl> component = new ArrayList<DnaComponentImpl>();
    
    @XmlAttribute(required = true)
    protected URI uri = null;
    @XmlAttribute(required = true)
    protected String displayId = null;
    @XmlAttribute
    protected String name = null;
    @XmlAttribute
    protected String description = null;

    public CollectionImpl(){
        this(null, null, null, null);
    }

    public CollectionImpl(URI uri, String displayId, String name, String description){
		this.uri = uri;
        this.displayId = displayId;
        this.name = name;
        this.description = description;
    }

    public URI getURI(){ return this.uri; }
    public void setURI(URI uri){ this.uri = uri; }

    public String getDisplayId() { return displayId; }
    public void setDisplayId(String value) { this.displayId = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public void addComponent(DnaComponent component){
        this.component.add((DnaComponentImpl)component);
    }
    public java.util.Collection<DnaComponent> getComponents(){
        return (java.util.Collection<DnaComponent>)(java.util.Collection<?>)component;
    }


    /*
    * Below here are methods used by the XML system but not humans.
    */

	public DnaComponentImpl findDnaComponent(URI uri){
		Iterator<DnaComponentImpl> iter = this.component.iterator();
		while(iter.hasNext()){
			DnaComponentImpl comp = iter.next();
			if(comp.getURI().equals(uri)) return comp;
		}
		return null;
	}
	
    public List<DnaComponentImpl> getComponent() {
        return component;
    }

    public void cleanupPostParse(){
        Iterator iter = component.iterator();
        while(iter.hasNext()){
            ((DnaComponentImpl)iter.next()).cleanupPostParse(this);
            
        }
    }
}
