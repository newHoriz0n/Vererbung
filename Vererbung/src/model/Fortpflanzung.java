package model;

import java.util.HashMap;
import java.util.Random;

public class Fortpflanzung {

	private static Random r = new Random();

	public static HashMap<String, Erbinfo> calcVererbung(HashMap<String, Erbinfo> a, HashMap<String, Erbinfo> b) {

		HashMap<String, Erbinfo> erbgut = new HashMap<>();

		for (String s : a.keySet()) {
			if (b.containsKey(s)) {
				erbgut.put(s, calcErbinfo(a.get(s),b.get(s)));
			} else {
				erbgut.put(s, a.get(s));
			}
		}
		
		return erbgut;

	}

	private static Erbinfo calcErbinfo(Erbinfo erbinfo, Erbinfo erbinfo2) {
		
		Allel[] as = new Allel[2];
		
		as[0] = erbinfo.getAllele()[r.nextInt(2)];
		as[1] = erbinfo2.getAllele()[r.nextInt(2)];	
		
		return new Erbinfo(erbinfo.getBezeichnung(), as);
	
	}

}
