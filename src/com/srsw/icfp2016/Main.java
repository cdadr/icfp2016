package com.srsw.icfp2016;

import java.io.FileInputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.err.println("usage: <this> problem_file");
			System.exit(1);
		}

		final String filename = args[0];
		final FileInputStream in = new FileInputStream(filename);
		final Problem problem;
		try {
			problem = new Problem(in);
		} finally {
			in.close();
		}
			System.out.println("Loaded problem from " + filename + ":");
			problem.dump(System.out);
	}
}

