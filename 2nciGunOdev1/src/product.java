
public class product {
	
	public product() {
		System.out.println("Yeni bir ara� eklemek i�in + butonuna bas�n�z");
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
