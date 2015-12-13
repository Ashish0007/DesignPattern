package Test;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1 : Add products");
			System.out.println("2 : remove products");
			System.out.println("3 : exit");
			ch = inp.nextInt();
			
			switch(ch){
			
				case 1:
					int ch1;
					do {
						System.out.println("1 : Add butter products");
						System.out.println("2 : Add milk products");
						System.out.println("3 : exit");
						ch1 = inp.nextInt();
						
						switch(ch1){
						
							case 1 : 
						
						}
						
						
					} while (ch1 != 3);
					break;
			
			
			}
			
		} while ( ch != 3);
	}

}
