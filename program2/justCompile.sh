#!/bin/bash

declare -a javas=("BankAccount.java" "SavingsAccount.java" "CheckingAccount.java" "CreditcardAccount.java")

GREEN="\e[0;32m"
RED="\e[0;31m"
YELLOW="\e[0;33m"
NC="\e[0m"

clear

for i in "${javas[@]}"
do
	echo -ne "\n${YELLOW}Compiling $i....\n"
	echo -ne "\n--------------------${NC}\n"
	if javac -Xlint:deprecation $i; then
		echo -ne "${GREEN}$i compiled successfully!${NC}\n"
	else
		echo -ne "${RED}$i --- compile failed !!! ---${NC}\n"
	fi
done

if find *.class; then
	rm *.class; echo -ne "\n${YELLOW}Class files cleaned up!${NC}\n"
else
	echo -ne "\n${YELLOW}No class files to clean up..${NC}\n"
fi


