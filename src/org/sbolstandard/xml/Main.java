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
		System.err.println("java --jar libSBOLxml.jar --parse <filename.xml>");
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
			CollectionImpl collection = parser.parse(new FileInputStream(input));
			System.out.println("Successfully parsed " + input + " with Parser.parse(InputStream input)");
			System.out.println("Reserializing:");
			System.out.println(parser.serialize(collection));
		} else {
			Main.printHelp();
			return;
		}
	}
}
