#!/bin/bash

xjc -p org.sbolstandard.xml scripts/sbol.xsd 
mv org/sbolstandard/xml/* src/org/sbolstandard/xml/
rm -rf org

