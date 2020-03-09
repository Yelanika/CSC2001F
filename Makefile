# binary search program makefile
# Hussein Suleman
# 27 March 2017

JAVAC=/usr/bin/javac
JC = javacJVM = java
File="Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $<

CLASSES =\
	BinaryTreeNode.class BinaryTree.class \
	BTQueueNode.class\
	BTQueue.class\
        BinarySearchTree.class\
	BinarySearchTreeTest.class\
	LSArrayApp.class\
	LSBSTApp.class	

MAIN = BinarySearchTreeTest 

default: classes

classes: $(CLASSES:.java=.class)

run:	$(MAIN).class
	$(JVM)$(MAIN)

clean:
	rm *.class
