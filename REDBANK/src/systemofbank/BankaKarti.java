package systemofbank;
public class BankaKarti extends Kart {
	
	private Hesap kartinhesabi;
	private int kartnumarası;
	private double maxipuan;
//Constructors
//************************************************************************************************
	public BankaKarti(Hesap hesap) {
		
		this.setKartinhesabi(hesap);
		this.setKartnumarası((int)(Math.random()*Math.pow(10, 16)));
		this.setMaxipuan(0);
	}
	
//Functions
//*************************************************************************************************
	
	@Override
	public void addMaxipuan(double fiyat){
		double totalpuan=this.getMaxipuan();
		totalpuan+=fiyat/100;
		this.setMaxipuan(totalpuan);
	}
	
	@Override
	public void satinAlma(String firmaadı,double odenecekpara,int taksitsayisi) {
		
		Urun alinanurun = new Urun(firmaadı,odenecekpara,taksitsayisi);
		
		double bakiyedurumu=this.kartinhesabi.getHesaptakiparamiktari();
		bakiyedurumu-=alinanurun.getFiyat();
		this.kartinhesabi.setHesaptakiparamiktari(bakiyedurumu);
		System.out.printf("%s frimasına %.2f tl miktarı ödeme yapılmıştır. Kartınız da %.2f tl vardır.\n",firmaadı,odenecekpara,this.kartinhesabi.getHesaptakiparamiktari());
	    this.addMaxipuan(odenecekpara);
		System.out.printf("Maxipuanınız:%.2f",this.getMaxipuan());
		
		
		
	}
	
//gets
//*******************************************************************************************
	
	public int getKartnumarası() {
		return kartnumarası;
	}
	public double getMaxipuan() {
		return maxipuan;
	}
	public Hesap getKartinhesabi() {
		return kartinhesabi;
	}
//sets
//********************************************************************************************

	public void setKartnumarası(int kartnumarası) {
		this.kartnumarası = kartnumarası;
	}
	public void setMaxipuan(double maxipuan) {
		this.maxipuan = maxipuan;
	}
	public void setKartinhesabi(Hesap kartinhesabi) {
		this.kartinhesabi = kartinhesabi;
	}

}
