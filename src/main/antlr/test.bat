@ECHO OFF
del miniCSharp*.class
antlr4 miniCSharp.g4 & javac miniCSharp*.java
ECHO Izvrsio drugu
PAUSE