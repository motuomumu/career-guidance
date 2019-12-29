package edu.swjtuhc.demo.model;

public class Orphanage {
	private int Orid;
	private String Orname;
	private String Oraddress;
	private String Ormember;
	public int getOrid() {
		return Orid;
	}
	public void setOrid(int orid) {
		Orid = orid;
	}
	public String getOrname() {
		return Orname;
	}
	public void setOrname(String orname) {
		Orname = orname;
	}
	public String getOraddress() {
		return Oraddress;
	}
	public void setOraddress(String oraddress) {
		Oraddress = oraddress;
	}
	public String getOrmember() {
		return Ormember;
	}
	public void setOrmember(String ormember) {
		Ormember = ormember;
	}
	@Override
	public String toString() {
		return "Orphanage [Orid=" + Orid + ", Orname=" + Orname + ", Oraddress=" + Oraddress + ", Ormember=" + Ormember
				+ "]";
	}
	
	
}
