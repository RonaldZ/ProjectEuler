cc=gcc
jc=javac
cpp=g++
CFLAGS=-Wall -o

all: ProblemTwoC ProblemTwoCPP ProblemTwoJava

ProblemTwoC: ProblemTwo.c
	$(cc) $(CFLAGS) ProblemTwoC ProblemTwo.c

ProblemTwoCPP: ProblemTwo.cpp
	$(cpp) $(CFLAGS) ProblemTwoCPP ProblemTwo.cpp

ProblemTwoJava: ProblemTwo.java
	$(jc) ProblemTwo.java

clean: 
	del ProblemTwoC.exe ProblemTwoCPP.exe ProblemTwo.class