package org.sbolstandard.xml;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;

import java.io.FileNotFoundException;

import org.sbolstandard.core.*;

/**
*	This is a simple command line utility for the XML tools.
**/
public class Main {
	public static void printHelp(){
		System.err.println("Usage:");
		System.err.println("java --jar libSBOLxml.jar --test-parse <filename.xml>");
	}
	
	public static String readFile(File file) throws FileNotFoundException {
		StringBuilder text = new StringBuilder();
		String NL = System.getProperty("line.separator");
		Scanner scanner = new Scanner(new FileInputStream(file));
		try {
			while (scanner.hasNextLine()){
				text.append(scanner.nextLine() + NL);
			}
		} finally {
			scanner.close();
		}
		return text.toString();
	}
	
	public static void main(String[] args) throws Exception {
		if(args.length < 2){
			Main.printHelp();
			return;
		}
		if(args[0].equals("--test-parse") && args.length == 2){
			File input = new File(args[1]);
			if(!input.canRead()){
				System.err.println("Unable to read " + input);
				return;
			}
			Parser parser = new Parser();
			CollectionImpl collection = parser.parse(Main.readFile(input));
			System.out.println("Successfully parsed " + input);
			System.out.println("Reserializing:");
			System.out.println(parser.serialize(collection));
			
			Collection<DnaComponent> components = collection.getComponents();
			for(Iterator<DnaComponent> iter = components.iterator(); iter.hasNext();) {
				DnaComponent component = iter.next();
				System.out.println(component.getName());

				for(Iterator<SequenceAnnotation> annotations = component.getAnnotations().iterator(); annotations.hasNext();) {
					SequenceAnnotation annotation = annotations.next();
					System.out.println("\t" + annotation);
				}
			}

		} else {
			Main.printHelp();
			return;
		}
	}
}