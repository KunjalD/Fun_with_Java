package edu.nyu.cs9053.homework3.oo;
import java.io.PrintStream;

public class Letter{
	
	// protected as it is only visible to this package
	protected char asciiChar[][];
	private final PrintStream asciiPStream;
	
	//Constructor with 2 arguments, 1 is the char array passed from the main class 
	// another is the printstream object 
	public Letter(char asciich[][],PrintStream asciips)
	{
		this.asciiChar = asciich;
		this.asciiPStream = asciips;
	}

	//Method which prints art to inputed printstream obj
	public void print()
	{
		for( int j = 0; j < asciiChar.length; j++ ) {
			asciiPStream.println(asciiChar[j]);
			asciiPStream.flush();
        }
	}
	
}