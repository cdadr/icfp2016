package com.srsw.icfp2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Rational {

	int numer, denom;

	public Rational(String inputString) throws IOException {
		String[] elems = inputString.split("/");
		if (elems.length == 1) {
			numer = Integer.parseInt(elems[0]);
			denom = 1;
		} else if (elems.length == 2) {
			numer = Integer.parseInt(elems[0]);
			denom = Integer.parseInt(elems[1]);
		} else {
			throw new IOException("invalid rational: \"" + inputString + "\"");
		}
	}

	@Override
	public String toString() {
		if (denom == 1) {
			return Integer.toString(numer);
		} else {
			return numer + "/" + denom;
		}
	}
}

