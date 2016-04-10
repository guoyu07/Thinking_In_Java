package com.elephant.io;
/**
 *  How to read from standard input.
 */

import java.io.*;

public class Echo {
	public static void main(String[] args)
			throws IOException {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));
		String s;
		while((s = stdin.readLine()) != null && s.length()!= 0)
			System.out.println(s);
	}
}
