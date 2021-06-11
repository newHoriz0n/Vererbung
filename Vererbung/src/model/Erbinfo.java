package model;

public class Erbinfo {

	/**
	 * Das, was
	 * 
	 */

	private String bezeichnung;
	private Allel[] allele;

	public Erbinfo(String bezeichnung, Allel[] allele) {
		this.allele = calcPhaenotyp(allele);
	}

	public Allel getPhaenoTyp(Allel[] allele) {
		return allele[0];
	}
	
	public Allel[] getAllele() {
		return allele;
	}

	/**
	 * Legt dominantes Allel auf Index 0
	 * @param allele
	 * @return
	 */
	private Allel[] calcPhaenotyp(Allel[] allele) {

		Allel[] as = new Allel[2];
		if (allele[0].getDominanz() > allele[1].getDominanz()) {
			as[0] = allele[0];
			as[1] = allele[1];
		} else {
			as[0] = allele[1];
			as[1] = allele[0];
		}

		return as.clone();

	}

	public String getBezeichnung() {
		return bezeichnung;
	}
	
}
