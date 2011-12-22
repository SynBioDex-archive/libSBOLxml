## libSBOLxml: a Java library for parsing and serializing SBOL XML.

[libSBOLxml](https://github.com/SynBioDex/libSBOLxml) is an implementation of the [SBOL Core Interfaces](https://github.com/SynBioDex/libSBOLcore) which uses JAXB to serialize and parse SBOL objects to and from XML.

## To checkout and build:

First, clone the repository:

    git clone git://github.com/SynBioDex/libSBOLxml.git

Second, pull down the core submodule:

    git submodule init
    git submodule update

Third, build libSBOLxml.jar:

    ant clean build

Fourth, run the tests:

    ant test

You should see output like this:

    (sbol)quin:libSBOLxml trevor$ ant clean test
    Buildfile: /Users/trevor/Documents/Agilent/Code/libSBOLxml/build.xml
    
    clean:
    [delete] Deleting directory /Users/trevor/Documents/Agilent/Code/libSBOLxml/build
    [delete] Deleting directory /Users/trevor/Documents/Agilent/Code/libSBOLxml/test
    [delete] Deleting: /Users/trevor/Documents/Agilent/Code/libSBOLxml/libSBOLxml.jar
    
    build:
    [mkdir] Created dir: /Users/trevor/Documents/Agilent/Code/libSBOLxml/build
    [javac] Compiling 4 source files to /Users/trevor/Documents/Agilent/Code/libSBOLxml/build
    [javac] Compiling 9 source files to /Users/trevor/Documents/Agilent/Code/libSBOLxml/build
    
    jar:
    [jar] Building jar: /Users/trevor/Documents/Agilent/Code/libSBOLxml/libSBOLxml.jar
    
    test:
    [mkdir] Created dir: /Users/trevor/Documents/Agilent/Code/libSBOLxml/test
    [junit] Testsuite: org.sbolstandard.xml.test.TestMarshalling
    [junit] Tests run: 1, Failures: 0, Errors: 0, Time elapsed: 0.496 sec
    [junit] ------------- Standard Output ---------------
    [junit] <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    [junit] <Collection description="This was generated during the test run." name="Complete Collection" displayId="collection-id-1234" uri="/col/1">
    [junit]     <component description="A Component" name="DnaComponent 4321" displayId="component-id-4321" uri="/comp/1"/>
    [junit]     <component description="A Component" name="DnaComponent 4444" displayId="component-id-4444" uri="/test/2">
    [junit]         <sequence uri="/seq/1">
    [junit]             <nucleotides>gataca</nucleotides>
    [junit]         </sequence>
    [junit]         <annotation subComponentURI="/test/2" bioEnd="50" bioStart="1" uri="/anno/1"/>
    [junit]         <annotation subComponentURI="/test/2" strand="+" bioEnd="900" bioStart="50" uri="/anno/2">
    [junit]             <precede uri="/anno/1"/>
    [junit]             <precede uri="/anno/2"/>
    [junit]         </annotation>
    [junit]     </component>
    [junit] </Collection>
    [junit] 
    [junit] <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    [junit] <Collection description="A simple example collection" name="Example 1 Collection" displayId="example-1-collection" uri="/col/2">
    [junit]     <component description="J23101" name="apFAB1" displayId="apFAB1" uri="/comp/23">
    [junit]         <sequence uri="/seq/23">
    [junit]             <nucleotides>TTTACAGCTAGCTCAGTCCTAGGTATTATGCTAGC</nucleotides>
    [junit]         </sequence>
    [junit]     </component>
    [junit] </Collection>
    [junit] 
    [junit] <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    [junit] <Collection description="A simple example collection" name="Example 2 Collection" displayId="example-2-collection" uri="/col/233">
    [junit]     <component description="pFAB21_J23101_Anderson_RBS" displayId="pFAB21" uri="/comp/4555">
    [junit]         <type>http://sbols.org/sbol.owl#plasmid</type>
    [junit]     </component>
    [junit]     <component description="pFAB22_J23101_Bujard_RBS" displayId="pFAB22" uri="/comp/2322">
    [junit]         <type>http://sbols.org/sbol.owl#plasmid</type>
    [junit]     </component>
    [junit]     <component description="pFAB23_J23101_B0030_RBS" displayId="pFAB23" uri="/comp/11123">
    [junit]         <type>http://sbols.org/sbol.owl#plasmid</type>
    [junit]     </component>
    [junit] </Collection>
    [junit] 
    [junit] ------------- ---------------- ---------------
    [junit] 
    [junit] Testcase: testSerialize took 0.467 sec
    
    BUILD SUCCESSFUL
    Total time: 3 seconds

## Pulling new versions

If you have an existing git repository for this project and want to pull from GitHub, you must also pull from the submodule directory.

    git pull
    cd core
    git pull

# Using libSBOLxml

## Serializing and deserializing SBOL XML

Here is a example which reads and then serializes an SBOL XML file:

	import java.io.*;
	import org.sbolstandard.core.*;
	import org.sbolstandard.xml.*;
	
	public class Main {
		public static void main(String[] args) throws Exception {
			Parser parser = new Parser();
			CollectionImpl collection = parser.parse(new FileInputStream(new File("testSBOL.xml")));
			System.out.println(parser.serialize(collection));
		}
	}

## Constructing collections

And here we're creating a collection using the libSBOLxml specific APIs.

	import org.sbolstandard.core.*;
	import org.sbolstandard.xml.*;
	
	public class Main{
		public static void main(String[] args) throws Exception {
			CollectionImpl collection = new CollectionImpl(UtilURI.Create("/col/1"), 
															"collection-id-1234", 
															"A human readable collection name", 
															"A human readable collection description.");
														
			DnaComponentImpl dnaComponent = new DnaComponentImpl(UtilURI.Create("/comp/1"),
																"component-id-4321", 
																"DnaComponent 4321", 
																"A human readable component name");
			collection.getComponent().add(dnaComponent);
			
			dnaComponent.setSequence(new DnaSequenceImpl(UtilURI.Create("/seq/1"),
			 											"agcgcccaatacgcaaaccgcctctccccgcgcgttggccga"));
		
			SequenceAnnotationImpl annotation = new SequenceAnnotationImpl(UtilURI.Create("/anno/1"));
			annotation.setBioStart(1);
			annotation.setBioEnd(10);
			dnaComponent.addAnnotation(annotation);
		}
	}

For examples of constructing and using collections with libSBOLxml, look at  [TestMarshalling.java](https://github.com/SynBioDex/libSBOLxml/blob/master/src/org/sbolstandard/xml/test/TestMarshalling.java).

# Tech notes:

libSBOLxml uses the [Java Architecture for XML Binding](http://www.oracle.com/technetwork/articles/javase/index-140168.html) (JAXB) to parse SBOL xml and serialize collections.  The classes which implement the org.sbolstandard.core interfaces (found in org.sbolstandard.xml) use Java decorators to signal how JAXB should handle those data.

For example, in CollectionImpl you'll find this snippet:

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "CollectionImpl", propOrder = { "component" })
	@XmlRootElement(name = "Collection")
	public class CollectionImpl implements Collection {
		...
	}

The decorators before the class definition signal to JAXB the details of XML handling like the name of the document root element and the order and type of sub elements.
