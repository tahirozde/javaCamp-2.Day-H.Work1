import java.util.Iterator;

import javax.sql.rowset.CachedRowSet;

public class main {

	public static void main(String[] args) {
		
		product cars1=  new product(1,"FORD","F�ESTA",16000);
		cars1.id=1;
		cars1.km=16000;
		cars1.marka="FORD";
		cars1.model="F�ESTA";

		product cars2= new product(2,"F�AT","L�NEA",325000);
		
		
		product cars3 = new product(3,"AUD�","A4",20000);
			
		
		product[] cars= {cars1,cars2,cars3};
		
		for (product product : cars) {
			System.out.println(product.marka);
			
		}
		
				System.out.println(cars.length);
				
		
		Catagory category1= new Catagory();
		category1.id=1;
		category1.name="KiRALIK ARA�";
		
		rentCarsMenager rentCars= new rentCarsMenager();
		rentCars.rentToCars(cars1);
		rentCars.rentToCars(cars2);
		rentCars.rentToCars(cars3);
		
	}

}
