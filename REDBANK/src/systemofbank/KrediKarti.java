package systemofbank;
import java.util.ArrayList;
public class KrediKarti extends Kart {
	private int musterinumarasi;
	private double limit;
	private double borc;
	private int kartnumarasi;
	private double maxipuan;
	private ArrayList <Urun> urunler = new ArrayList<Urun>();
//Constructor
//*************************************************************************************************
//	public KrediKarti(int musterino){
//		
//	}
	
	public KrediKarti(int musterino, double kredikartilimiti){
		this.setLimit(kredikartilimiti);
		this.setKartnumarasi((int)(Math.random()*Math.pow(10, 16)));
		this.setMaxipuan(0);
		this.setUrunler(null);
		
	}
	
//Functions
//*************************************************************************************************
	
	public void addUrun(Urun urun) {
		this.urunler.add(urun);
	}
	
	@Override
	public void addMaxipuan(double fiyat) {
		double totalpuan=this.getMaxipuan();
		totalpuan+=fiyat/100;
		this.setMaxipuan(totalpuan);
		
	}
	

	@Override
	public void satinAlma(String firmaadi, double ödenecektutar, int taksitsayisi) {
		
		Urun yeniurun = new Urun(firmaadi,ödenecektutar,taksitsayisi);
		this.addUrun(yeniurun);
		
		
	}
//gets
//**************************************************************************************************

	public double getLimit() {
		return limit;
	}

	public double getBorc() {
		return borc;
	}

	public int getKartnumarasi() {
		return kartnumarasi;
	}
	
	public double getMaxipuan() {
		return maxipuan;
	}
	
	public ArrayList<Urun> getUrunler() {
		return urunler;
	}
	public void setMusterinumarasi(int musterinumarasi) {
		this.musterinumarasi = musterinumarasi;
	}

	
//sets
//**************************************************************************************************
	public void setLimit(double limit) {
		this.limit = limit;
	}

	public void setBorc(double borc) {
		this.borc = borc;
	}

	public void setKartnumarasi(int kartnumarası) {
		this.kartnumarasi = kartnumarası;
	}

	public void setMaxipuan(double maxipuan) {
		this.maxipuan = maxipuan;
	}
	
	public void setUrunler(ArrayList<Urun> Nsn){
		this.urunler=Nsn;
	}

	public int getMusterinumarasi() {
		return musterinumarasi;
	}
	


	
}
