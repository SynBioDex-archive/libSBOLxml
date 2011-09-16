package org.sbolstandard.xml;

import java.util.ArrayList;
import java.util.List;
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
    protected String displayId = null;
    @XmlAttribute
    protected String name = null;
    @XmlAttribute
    protected String description = null;

    public CollectionImpl(){
        this(null, null, null);
    }

    public CollectionImpl(String displayId, String name, String description){
        this.displayId = displayId;
        this.name = name;
        this.description = description;
    }


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
    public List<DnaComponentImpl> getComponent() {
        return component;
    }

}
