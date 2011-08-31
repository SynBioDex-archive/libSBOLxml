#!/bin/bash
export CLASSPATH=../libs/*:$CLASSPATH

# Create the QIML
java com.jxml.quick.config.Main classpath:///com/jxml/quick/util/qjml2qiml/qjml2qiml.config -in Collection.qjml -out Collection.qiml

java com.jxml.quick.config.Main classpath:///com/jxml/quick/util/qiml2java/qiml2java.config -in Collection.qiml -out CollectionSchema.java -class CollectionSchema -key Collection.qjml
