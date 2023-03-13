package ustbatchno3.TestNG;

public class vishwadetails {
	private String city;
	int pricewithmat,pricewithoutmat;
	public vishwadetails(String city, int pricewithmat, int pricewithoutmat) {
		super();
		this.city = city;
		this.pricewithmat = pricewithmat;
		this.pricewithoutmat = pricewithoutmat;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPricewithmat() {
		return pricewithmat;
	}
	public void setPricewithmat(int pricewithmat) {
		this.pricewithmat = pricewithmat;
	}
	public int getPricewithoutmat() {
		return pricewithoutmat;
	}
	public void setPricewithoutmat(int pricewithoutmat) {
		this.pricewithoutmat = pricewithoutmat;
	}
	@Override
	public String toString() {
		return "City: " + getCity() + "\nPrice with material : " + getPricewithmat() + "\nPrice without material : " + getPricewithoutmat() + "\n\n";
	}
	
	
}
