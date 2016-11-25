package systemofbank;

public class IslemOzeti {
	
	private String yapilanisleminadi;
	private int yapilanisinhesapno;
	private double yapilanisintutarı;
	private Tarih yapilanislemintarihi;
	private int ilgilihesapno;
	
	
	public IslemOzeti(String isleminadı,int islemigerceklestirenhesapno, Tarih islemingerceklestigitarih, Urun urun){
		this.setYapilanisleminadi(isleminadı);
		this.setYapilanisinhesapno(islemigerceklestirenhesapno);
		this.setYapilanislemintarihi(islemingerceklestigitarih);
		this.setYapilanisintutarı(urun.getFiyat());
	}
	public IslemOzeti(String isleminadı,int islemigerceklestirenhesapno, Tarih islemingerceklestigitarih, int ilgilihesapno, double tutar){
		this.setYapilanisleminadi(isleminadı);
		this.setYapilanisinhesapno(islemigerceklestirenhesapno);
		this.setYapilanislemintarihi(islemingerceklestigitarih);
		this.setYapilanisintutarı(tutar);
		
		
	}
	public String getYapilanisleminadi() {
		return yapilanisleminadi;
	}

	public void setYapilanisleminadi(String yapilanisleminadi) {
		this.yapilanisleminadi = yapilanisleminadi;
	}

	public int getYapilanisinhesapno() {
		return yapilanisinhesapno;
	}

	public void setYapilanisinhesapno(int yapilanisinhesapno) {
		this.yapilanisinhesapno = yapilanisinhesapno;
	}

	public double getYapilanisintutarı() {
		return yapilanisintutarı;
	}

	public void setYapilanisintutarı(double yapilanisintutarı) {
		this.yapilanisintutarı = yapilanisintutarı;
	}

	public Tarih getYapilanislemintarihi() {
		return yapilanislemintarihi;
	}

	public void setYapilanislemintarihi(Tarih yapilanislemintarihi) {
		this.yapilanislemintarihi = yapilanislemintarihi;
	}
	public int getIlgilihesapno() {
		return ilgilihesapno;
	}
	public void setIlgilihesapno(int ilgilihesapno) {
		this.ilgilihesapno = ilgilihesapno;
	}

}
