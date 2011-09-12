package org.sbolstandard.xml;

import java.io.InputStream;
import java.io.StringReader;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBException;

import javax.xml.transform.stream.StreamSource;

import org.sbolstandard.core.Collection;


public class Parser{
	public Parser(){
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