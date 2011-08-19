# libSBOLxml: a Java library for parsing and serializing SBOL XML.

We are in the process of setting up this repository.  When it is ready it will contain the code required to build libSBOLxml.

## To checkout and build:

First, clone the repository:

    git clone git://github.com/SynBioDex/libSBOLxml.git

Second, pull down the core submodule:

    git submodule init
    git submodule update

Third, build libSBOLxml.jar:

    ant

## Pulling new versions

If you have an existing git repository for this project and want to pull from GitHub, you must also pull from the submodule directory.

    git pull
    cd core
    git pull

