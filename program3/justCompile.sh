#!/bin/bash

GREEN="\e[0;32m"
RED="\e[0;31m"
YELLOW="\e[0;33m"
NC="\e[0m"


RUN="FALSE"

MY_JAVA=BSTree.java


clear

if javac -Xlint:deprecation $MY_JAVA; then
	echo -ne "${GREEN}$MY_JAVA compiled successfully!${NC}\n"
	RUN="TRUE"
else
	echo -ne "${RED}$MY_JAVA --- compile failed !!! ---${NC}\n"
fi

if [ $RUN == "TRUE" ] && javac -Xlint:deprecation LogicTests.java; then
	echo -ne "\n${YELLOW}RUNNING\n"
	echo -ne "\n------------${NC}\n"
	java LogicTests
fi



if find *.class; then
	rm *.class; echo -ne "\n${YELLOW}Class files cleaned up!${NC}\n"
else
	echo -ne "\n${YELLOW}No class files to clean up..${NC}\n"
fi


