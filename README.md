# libSBOLxml: a Java library for parsing and serializing SBOL XML.

This is an implementation of the [SBOL Core Interfaces](https://github.com/SynBioDex/libSBOLcore) which uses JAXB to serialize and parse SBOL objects to and from XML.

NOTE: We are actively working on this implementation but it is not ready for use.

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

## Pulling new versions

If you have an existing git repository for this project and want to pull from GitHub, you must also pull from the submodule directory.

    git pull
    cd core
    git pull

