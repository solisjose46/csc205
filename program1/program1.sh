#!/bin/bash

#case1.txt tests adding employees, listing them all, and bounds
#case1.txt tests finding employees and giving them, raises
#case3.txt test give paychecks and changing hours
#case4.txt tests searching employees and changing hours of appropiate employees

clear

declare -a testcases=("case1.txt" "case2.txt" "case3.txt" "case4.txt")
if javac Company.java; then
	echo -ne "Files complied Succ!\n"
	echo -ne "Running Company.class\n"
	echo -ne "-----------------------\n\n"
	
	for i in "${testcases[@]}"; do
		echo -ne "\n\tRunning test case:\t$i\n"
		echo -ne "\t-------------------------\n"
		cat $i | java Company
	done
else
	echo -ne "Compile failed!\n"
fi

rm *.class
echo -ne "\n---------------\n"
echo -ne "class files removed!\n"
