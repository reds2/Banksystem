package systemofbank;
public class Urun {
	private final double taksitlendirmeucretiyuzdesi=0.01;
	private String urununadi;
	private final int maxtaksitsayisi=12;
	private double fiyat;
	private int taksitsayisi;
	private double[] ayliktaksit =new double[maxtaksitsayisi];
//Constructor
//*****************************************************************************************************
	public Urun(String urunadi,double fiyatı,int taksit){

		this.setUrununadi(urunadi);
		this.setFiyat(fiyatı);
		if(taksit==0){
			this.setTaksitsayisi(1);
		}
		else{
			this.setTaksitsayisi(taksit);
		}
		
	}
//Functions
//*****************************************************************************************************
	public void Taksitlendirme(){
		double ayliktaksittutarı = (this.getFiyat()*(1+taksitlendirmeucretiyuzdesi*this.getTaksitsayisi()))/this.getTaksitsayisi();
		double[] ayliktutartablosu =new double[this.maxtaksitsayisi];
		Tarih tarih =new Tarih();
		for(int index=0;index<taksitsayisi;index++){
			ayliktutartablosu[(index+tarih.getAy())%maxtaksitsayisi]+=ayliktaksittutarı;
		}
		this.setAyliktaksit(ayliktutartablosu);
	}
//gets
//****************************************************************************************************
	public int getTaksitsayisi() {
		return taksitsayisi;
	}
	
	public double[] getAyliktaksit() {
		return ayliktaksit;
	}

	public double getFiyat() {
		return fiyat;
	}

	public String getUrununadi() {
		return urununadi;
	}
	
	
//sets
//************************************************************************************************
	public void setTaksitsayisi(int taksitsayisi) {
		this.taksitsayisi = taksitsayisi;
	}
	
	public void setAyliktaksit(double[] ayliktaksit) {
		this.ayliktaksit = ayliktaksit;
	}
	
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	public void setUrununadi(String urununadi) {
		this.urununadi = urununadi;
	}

}

