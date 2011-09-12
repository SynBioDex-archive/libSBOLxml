package org.sbolstandard.xml;

import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBException;

import javax.xml.transform.stream.StreamSource;

import org.sbolstandard.core.Collection;


public class Parser{
	public Parser(){
	}

	public String serialize(CollectionImpl collection) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(CollectionImpl.class.getPackage().getName());
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		StringWriter writer = new StringWriter();
		marshaller.marshal(collection, writer);
		return writer.toString();
	}

	public CollectionImpl parse(String xml) throws JAXBException {
		try{
			return parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e){
			e.printStackTrace();
			return null;
		}
	}
	
	public CollectionImpl parse(InputStream input) throws JAXBException {
		String packageName = CollectionImpl.class.getPackage().getName();
		JAXBContext jc = JAXBContext.newInstance( packageName );
		Unmarshaller u = jc.createUnmarshaller();
		JAXBElement doc = (JAXBElement)u.unmarshal(input);
		return (CollectionImpl)doc.getValue();
	}
}
