package motherDairy.products.Butter;

import motherDairy.factory.AbstractProductFactory;
import motherDairy.factory.ProductFactory;


public class ButterFactory implements AbstractProductFactory{

	@Override
	public ProductFactory getProductFactory(String butterProduct) {
		
		switch(butterProduct){
			case "sweet" : return new SweetButter();
			case "salted" : return new SaltedButter();		
		}
		
		return null;
	}

}
