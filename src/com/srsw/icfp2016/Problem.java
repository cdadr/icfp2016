package com.srsw.icfp2016;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;
import java.io.BufferedReader;


public class Problem {

	/** silhouette */
	Polygon polygons[];

	/** skeleton */
	LineSegment segments[];


	public Problem() {
	}


	public Problem(InputStream in) throws IOException {
		this();
		load(in);
	}


	public void dump(PrintStream out) {
		if (polygons == null) {
			out.println("(polygons == null)");
		} else {
			out.println("nPolygons: " + polygons.length);
			for (int i = 0; i < polygons.length; i++) {
				out.println("  polygons[" + i + "]:");
				polygons[i].dump(out);
			}
		}

		if (segments == null) {
			out.println("(segments == null)");
		} else {
			out.println("nSegments: " + segments.length);
			for (int i = 0; i < segments.length; i++) {
				out.println("  segments[" + i + "]:" + segments[i]);
			}
		}
	}


	public static String readNonemptyLine(BufferedReader reader, String message) throws IOException {
		String line = reader.readLine();
		if (line == null) {
			throw new IOException("EOF reading " + message);
		}
		return line.trim();
	}


	public void load(InputStream in) throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		
		final int nPolygons = Integer.parseInt(readNonemptyLine(reader, "number of polygons"));
		polygons = new Polygon[nPolygons];
		for (int i = 0; i < polygons.length; i++) {
			polygons[i] = new Polygon(reader, i);
		}
		
		final int nSegments = Integer.parseInt(readNonemptyLine(reader, "number of segments"));
		segments = new LineSegment[nSegments];
		for (int i = 0; i < segments.length; i++) {
			final String line = readNonemptyLine(reader, "segment[" + i + "]");
			segments[i] = new LineSegment(line);
		}
	}
}

