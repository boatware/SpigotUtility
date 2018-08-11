package de.exodus.fp.helper;

import de.exodus.fp.general.Config;

public class Short {
	public static void p(String str) {
		System.out.println(str);
	}
	
	public static void dp(String str) {
		Config c = new Config();
		if (c.isDebug()) {
			p("=== DEBUG:");
			p(str);
			p("=== END DEBUG ===");
		}
	}
}
