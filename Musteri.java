package systemofbank;
import java.util.ArrayList;

public class Musteri {
	
	private int musterinumarasi;
//	private ArrayList<VadeliMevduatHesabi> vadelimevduathesabi = new ArrayList<VadeliMevduatHesabi>();
	private ArrayList<Hesap> hesaplar = new ArrayList<Hesap>();
//	private BankaKarti bankakarti;
//	private KrediKarti kredikarti;
	private ArrayList<Kart> kartlar = new ArrayList<Kart>();
	private Islemler islemler;
	
	
	public Musteri(){
		
		this.setMusterinumarasi((int)(Math.random()*Math.pow(10,8)));
		
	}
	
	public VadeliMevduatHesabi hesapNumarasınaGoreHesapBelirleme(int hesapno){
		int arananarrayelemani=0;
		for(int index=0;index<this.getHesaplar().size();index++){
			if(this.getHesaplar().get(index).getHesapnumarasi()==hesapno){
				arananarrayelemani=index;
			}
		}
		return (VadeliMevduatHesabi)this.getHesaplar().get(arananarrayelemani);
	}

	public int getMusterinumarasi() {
		return musterinumarasi;
	}

	public void setMusterinumarasi(int musterinumarasi) {
		this.musterinumarasi = musterinumarasi;
	}

	

//	public BankaKarti getBankakarti() {
//		return bankakarti;
//	}
//
//	public void setBankakarti(BankaKarti bankakarti) {
//		this.bankakarti = bankakarti;
//	}
//
//	public KrediKarti getKredikarti() {
//		return kredikarti;
//	}
//
//	public void setKredikarti(KrediKarti kredikarti) {
//		this.kredikarti = kredikarti;
//	}

	public Islemler getIslemler() {
		return islemler;
	}

	public void setIslemler(Islemler islemler) {
		this.islemler = islemler;
	}

//	public ArrayList<VadeliMevduatHesabi> getVadelimevduathesabi() {
//		return vadelimevduathesabi;
//	}
//
//	public void addVadelimevduathesabi(VadeliMevduatHesabi vadelimevduathesabi) {
//		this.vadelimevduathesabi.add(vadelimevduathesabi);
//	}

	public ArrayList<Hesap> getHesaplar() {
		return hesaplar;
	}

	public void addHesaplar(Hesap hesap) {
		this.hesaplar.add(hesap);
	}

	public ArrayList<Kart> getKartlar() {
		return kartlar;
	}

	public void addKartlar(Kart kart) {
		this.kartlar.add(kart);
	}

}
