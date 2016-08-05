package com.srsw.icfp2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Vertex {

	Rational x;
	Rational y;

	public Vertex(String inputString) throws IOException {
		String[] coords = inputString.split(",");
		if (coords.length != 2) {
			throw new IOException("invalid vertex: \"" + inputString + "\"");
		}
		
		x = new Rational(coords[0]);
		y = new Rational(coords[1]);
	}


	@Override
	public String toString() {
		return "(x=" + x + ",y=" + y + ")";
	}
}

