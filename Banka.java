package systemofbank;
import java.util.ArrayList;
public class Banka {
	
	private ArrayList<Musteri> tummusteriler = new ArrayList<Musteri>();

	public Banka(){
		//this.addTummusteriler(null);
	}
	public void musteriOlmaTalebi(){
		Musteri yenimusteri = new Musteri();
		this.addTummusteriler(yenimusteri);
		System.out.println("işlem tamamlanmıştır");
	}
	public void musteriNumarasiListesi(){
		
	}
	public ArrayList<Musteri> getTummusteriler() {
		return tummusteriler;
	}

	public void addTummusteriler(Musteri musteri) {
			this.tummusteriler.add(musteri);
	
	}

}
