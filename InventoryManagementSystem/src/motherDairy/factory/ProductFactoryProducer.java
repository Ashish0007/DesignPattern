package motherDairy.factory;

import motherDairy.products.Butter.ButterFactory;
import motherDairy.products.milk.MilkFactory;

public final class ProductFactoryProducer {

	public static AbstractProductFactory getProductFactory(String productFactory){
		
		switch(productFactory){
		
				case "butterFactory" : return new ButterFactory();
				case "milkFactory" : return new MilkFactory();
		}
		return null;
	}
}
