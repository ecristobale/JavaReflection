package org.ecristobale.java.model;

public class ClaseCualquieraA {
	
	private String atributoA;
	
	private int atributoB;
	
	private boolean atributoC;
	
	private int atributoD;

	public ClaseCualquieraA(String atributoA, int atributoB, boolean atributoC, int atributoD) {
		this.atributoA = atributoA;
		this.atributoB = atributoB;
		this.atributoC = atributoC;
		this.atributoD = atributoD;
	}
	
	public ClaseCualquieraA() {
	}

	public void operationA() {
		atributoB += atributoD;
	}
	
	public String getAtributoA() {
		return atributoA;
	}
	public void setAtributoA(String atributoA) {
		this.atributoA = atributoA;
	}
	public int getAtributoB() {
		return atributoB;
	}
	public void setAtributoB(int atributoB) {
		this.atributoB = atributoB;
	}
	public boolean isAtributoC() {
		return atributoC;
	}
	public void setAtributoC(boolean atributoC) {
		this.atributoC = atributoC;
	}
	public int getAtributoD() {
		return atributoD;
	}
	public void setAtributoD(int atributoD) {
		this.atributoD = atributoD;
	}	
}
