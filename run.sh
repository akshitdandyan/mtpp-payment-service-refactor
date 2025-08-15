#!/bin/bash

echo "=== Compiling Java files ==="
javac src/main/java/app/*.java

if [ $? -eq 0 ]; then
    echo "=== Running Payment System Demo ==="
    java -cp src/main/java/app Main
    
    echo ""
    echo "=== Cleaning up class files ==="
    rm -f src/main/java/app/*.class
    echo "Class files removed."
else
    echo "Compilation failed. Class files not removed."
    exit 1
fi 