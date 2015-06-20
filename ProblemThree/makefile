cc=gcc
jc=javac
cpp=g++
CFLAGS=-Wall -o

all: ProblemThreeJava

ProblemThreeC:
	$(cc) $(CFLAGS) ProblemThreeC ProblemThree.c PrimeFinder.c

ProblemThreeCPP:
	$(cpp) $(CFLAGS) ProblemThreeCPP ProblemThree.cpp PrimeFinder.cpp

ProblemThreeJava:
	$(jc) ProblemThree.java PrimeFinder.java

clean: 
	del ProblemThreeC.exe ProblemThreeCPP.exe ProblemThree.class PrimeFinder.class 