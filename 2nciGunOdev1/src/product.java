
public class product {
	
	public product() {
		System.out.println("Yeni bir araç eklemek için + butonuna basýnýz");
	}
	
	public product(int id,String marka,String model,double km) {
		this.id=id;
		this.marka=marka;
		this.model=model;
		this.km=km;
		
	}
	   int id;
       String marka;
       String model;
       double km;
}
