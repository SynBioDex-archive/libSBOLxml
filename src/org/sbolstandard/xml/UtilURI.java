package org.sbolstandard.xml;

import java.net.URI;

public class UtilURI {
	public static URI Create(String uri){
		try {
			return new URI(uri);
		} catch (Exception e){
			return null;
		}
	}
}