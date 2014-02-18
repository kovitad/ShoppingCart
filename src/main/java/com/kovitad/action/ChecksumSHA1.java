package com.kovitad.action;

import java.io.*;
import java.security.MessageDigest;

public class ChecksumSHA1 {
	public static byte[] createChecksum(final String filename) throws Exception {
		InputStream fis = new FileInputStream(filename);

		byte[] buffer = new byte[1024];
		MessageDigest complete = MessageDigest.getInstance("SHA1");
		int numRead;
		do {
			numRead = fis.read(buffer);
			if (numRead > 0) {
				complete.update(buffer, 0, numRead);
			}
		} while (numRead != -1);
		fis.close();
		return complete.digest();
	}

	// see this How-to for a faster way to convert
	// a byte array to a HEX string
	public static String getSHA1Checksum(final String filename) throws Exception {
		byte[] b = createChecksum(filename);
		String result = "";
		for (int i = 0; i < b.length; i++) {
			result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
		}
		return result;
	}

	public static void main(String args[]) {
		try {
			System.out
					.println(getSHA1Checksum("c:/Temp/pom.xml"));
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
