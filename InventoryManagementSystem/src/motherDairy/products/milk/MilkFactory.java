package motherDairy.products.milk;

import motherDairy.factory.AbstractProductFactory;
import motherDairy.factory.ProductFactory;

public class MilkFactory implements AbstractProductFactory {

	@Override
	public ProductFactory getProductFactory(String milkProduct) {
		
		switch(milkProduct){
			case "toned" : return new TonedMilk();
			case "cream" : return new CreamMilk(); 
		
		}
		
		return null;
	}

	
}
