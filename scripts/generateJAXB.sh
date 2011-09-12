#!/bin/bash

xjc -p org.sbolstandard.xml src/org/sbolstandard/xml/sbol.xsd 
mv org/sbolstandard/xml/* src/org/sbolstandard/xml/
rm -rf org

echo 'Now add @XmlRootElement(name = "Collection") to the CollectionImpl class'