package org.ecristobale.java.model;

public class ClaseCualquieraB {

	private int atributoA;
	
	private String atributoB;
	
	private boolean atributoC;
	
	private String atributoD;

	public ClaseCualquieraB(int atributoA, String atributoB, boolean atributoC, String atributoD) {
		this.atributoA = atributoA;
		this.atributoB = atributoB;
		this.atributoC = atributoC;
		this.atributoD = atributoD;
	}
	
	public void operationA() {
		atributoB += atributoD;
	}
	
	public int getAtributoA() {
		return atributoA;
	}
	public void setAtributoA(int atributoA) {
		this.atributoA = atributoA;
	}
	public String getAtributoB() {
		return atributoB;
	}
	public void setAtributoB(String atributoB) {
		this.atributoB = atributoB;
	}
	public boolean isAtributoC() {
		return atributoC;
	}
	public void setAtributoC(boolean atributoC) {
		this.atributoC = atributoC;
	}
	public String getAtributoD() {
		return atributoD;
	}
	public void setAtributoD(String atributoD) {
		this.atributoD = atributoD;
	}	
}
