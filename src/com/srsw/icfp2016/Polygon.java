package com.srsw.icfp2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Polygon {

	Vertex[] verts;


	public Polygon(BufferedReader reader, int polyNum) throws IOException {
		final int nVerts = Integer.parseInt(Problem.readNonemptyLine(reader, "number of verts, polygon[" + polyNum + "]"));

		verts = new Vertex[nVerts];
		for (int i = 0; i < verts.length; i++) {
			final String line = Problem.readNonemptyLine(reader, "vertex[" + i + "], polygon[" + polyNum + "]");
			verts[i] = new Vertex(line);
		}
	}

	public void dump(PrintStream out) {
		if (verts == null) {
			out.println("    (verts == null)");
		} else {
			out.println("    nVerts: " + verts.length);
			for (int i = 0; i < verts.length; i++) {
				out.println("      verts[" + i + "]: " + verts[i]);
			}
		}
	}
}

