cc=gcc
jc=javac
cpp=g++
CFLAGS=-Wall -o

all: ProblemOneC ProblemOneCPP ProblemOneJava

ProblemOneC: ProblemOne.c
	$(cc) $(CFLAGS) ProblemOneC ProblemOne.c

ProblemOneCPP: ProblemOne.cpp
	$(cpp) $(CFLAGS) ProblemOneCPP ProblemOne.cpp

ProblemOneJava: ProblemOne.java
	$(jc) ProblemOne.java

clean: 
	del ProblemOneC.exe ProblemOneCPP.exe ProblemOne.class