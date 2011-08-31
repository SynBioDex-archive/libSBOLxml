package org.sbolstandard.xml;

import java.util.Iterator;

// Quick imports
import com.jxml.quick.QDoc;
import com.jxml.quick.Quick;

import org.sbolstandard.core.*;

public class QuickTest {

	public static void main(String[] args) throws Exception {
		Collection collection = new Collection();
		QDoc schema = CollectionSchema.createSchema();
		QDoc qDoc = Quick.createDoc(collection, schema);
		System.out.println("qDoc" + qDoc);
		String xml = Quick.express(qDoc);
		System.out.println(xml);
	}

	public static void foo(String[] args){
    try {
      if (args.length != 2) {
        System.err.println("Usage: java QuickTest [input file] [output file]");
        return;
      }


      // Initialize Quick
      QDoc schema = CollectionSchema.createSchema();

      // Convert input XML to Java
      QDoc doc = Quick.parse(schema, args[0]);

      // Get the result
      Collection collection = (Collection)Quick.getRoot(doc);

      // Write out modified XML
      Quick.express(doc, args[1]);
    } catch (Exception e) {
       e.printStackTrace();
    }
  }
}