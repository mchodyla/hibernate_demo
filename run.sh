#!/bin/bash

mvn dependency:build-classpath -Dmdep.outputFile=cp.txt
mvn package

classpath="$(cat cp.txt)"
classpath="${classpath}:./target/hibernate_demo-1.0-SNAPSHOT.jar"

echo
echo "${classpath}"
echo

java -cp $classpath com.matthewgoing.App
#java -jar ./target/hibernate_demo-1.0-SNAPSHOT.jar
