package com.srsw.icfp2016;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;
import java.io.BufferedReader;


public class LineSegment {

	Vertex p0, p1;

	public LineSegment(String inputString) throws IOException {
		String[] coords = inputString.split(" ");
		if (coords.length != 2) {
			throw new IOException("invalid segment: \"" + inputString + "\"");
		}

		p0 = new Vertex(coords[0]);
		p1 = new Vertex(coords[1]);
	}

	
	@Override
	public String toString() {
		return p0 + " <-> " + p1;
	}
}

