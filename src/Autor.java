
public class Autor {
 private String jmeno;
 public String getJmeno() {
	return jmeno;
}
public void setJmeno(String jmeno) {
	this.jmeno = jmeno;
}
public String getPrijmeni() {
	return prijmeni;
}
public void setPrijmeni(String prijmeni) {
	this.prijmeni = prijmeni;
}
public Autor(String jmeno) {
	super();
	this.jmeno = jmeno;
}
private String prijmeni;
@Override
public String toString() {
	 return jmeno+ ": "+ prijmeni+"-->  Kc";
}
}
