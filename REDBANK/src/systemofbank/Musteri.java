package systemofbank;
import java.util.ArrayList;

public class Musteri {
	
	private int musterinumarasi;
	private ArrayList<VadeliMevduatHesabi> vadelimevduathesabi = new ArrayList<VadeliMevduatHesabi>();
	private BankaKarti bankakarti;
	private KrediKarti kredikarti;
	private Islemler islemler;
	
	
	public Musteri(){
		
		this.setMusterinumarasi((int)(Math.random()*Math.pow(10,8)));
		
	}
	
	public VadeliMevduatHesabi hesapNumarasınaGoreHesapBelirleme(int hesapno){
		int arananarrayelemani=0;
		for(int index=0;index<this.getVadelimevduathesabi().size();index++){
			if(this.getVadelimevduathesabi().get(index).getHesapnumarasi()==hesapno){
				arananarrayelemani=index;
			}
		}
		return this.getVadelimevduathesabi().get(arananarrayelemani);
	}

	public int getMusterinumarasi() {
		return musterinumarasi;
	}

	public void setMusterinumarasi(int musterinumarasi) {
		this.musterinumarasi = musterinumarasi;
	}

	

	public BankaKarti getBankakarti() {
		return bankakarti;
	}

	public void setBankakarti(BankaKarti bankakarti) {
		this.bankakarti = bankakarti;
	}

	public KrediKarti getKredikarti() {
		return kredikarti;
	}

	public void setKredikarti(KrediKarti kredikarti) {
		this.kredikarti = kredikarti;
	}

	public Islemler getIslemler() {
		return islemler;
	}

	public void setIslemler(Islemler islemler) {
		this.islemler = islemler;
	}

	public ArrayList<VadeliMevduatHesabi> getVadelimevduathesabi() {
		return vadelimevduathesabi;
	}

	public void addVadelimevduathesabi(VadeliMevduatHesabi vadelimevduathesabi) {
		this.vadelimevduathesabi.add(vadelimevduathesabi);
	}

}
