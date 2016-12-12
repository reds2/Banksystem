package systemofbank;

import java.util.Scanner;

public class bankaAnaProgrami {
	
	public static void main (String [] args){
		int key;
		boolean q=true;
		Scanner tara = new Scanner(System.in);
		Banka bank = new Banka();
		while(q){
			
			System.out.println("Yapmak istediğiniz işlemi giriniz:"
					+ "\n1.müştetimiz olmak için \n2.Müşteri numarası öğrenme\n3.kişi bilgileri görüntüle\n4.çık\n=>");
			key = Integer.parseInt(tara.nextLine());
			switch (key){
			case 1:
				bank.musteriOlmaTalebi();
				break;
			case 2:
				for(int index=0;index<bank.getTummusteriler().size();index++){
					System.out.println(bank.getTummusteriler().get(index).getMusterinumarasi());
				}
				break;
			case 3:	
				break;
			case 4:
				q=false;
				break;
				
			}
		
		}
		tara.close();
	}
}
