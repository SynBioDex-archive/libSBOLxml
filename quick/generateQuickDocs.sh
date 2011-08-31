#!/bin/bash
export CLASSPATH=../libs/*:$CLASSPATH

# Generate the qdml
java com.jxml.quick.config.Main classpath:///com/jxml/quick/util/dtd2qdml/dtd2qdml.config -in Collection.dtd -out Collection.qdml

# Set the root
java com.jxml.quick.config.Main classpath:///com/jxml/quick/util/qdmlRoot/setRoot.config -in Collection.qdml -out Collection.qdml -root Collection

# Generate the qjml
java com.jxml.quick.config.Main classpath:///com/jxml/quick/util/qdml2qjml/qdml2qjml.config -in Collection.qdml -package org.sbolstandard.core -out Collection.qjml
