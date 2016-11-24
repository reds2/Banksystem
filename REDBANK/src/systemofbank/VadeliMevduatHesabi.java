package systemofbank;

public class VadeliMevduatHesabi extends Hesap {
	
	private double hesaptakiparamiktari;
	private int hesapnumarasi;
	private int musterinumarasi;
	
	
	public VadeliMevduatHesabi(int musterino) {
		this.setHesapnumarasi((int)(Math.random()*Math.pow(10,11)));
		this.setHesaptakiparamiktari(0);
		this.setMusterinumarasi(musterino);
	}

	@Override
	public void hesabaYatırım(double para) {
		
		double gucelhesaptakitutar=this.getHesaptakiparamiktari();
		gucelhesaptakitutar+=para;
		setHesaptakiparamiktari(gucelhesaptakitutar);
		System.out.printf("%.2f tl miktar hesabınıza yatırılmıştır. Kartınız da %.2f tl vardır.\n",gucelhesaptakitutar,this.getHesaptakiparamiktari());	
		
	}

	@Override
	public void hesaptanCekim(double para) {
		
		double gucelhesaptakitutar=this.getHesaptakiparamiktari();
		gucelhesaptakitutar-=para;
		setHesaptakiparamiktari(gucelhesaptakitutar);
		System.out.printf("%.2f tl miktar hesabınıza yatırılmıştır. Kartınız da %.2f tl vardır.\n",gucelhesaptakitutar,this.getHesaptakiparamiktari());	
		
	}

	@Override
	public void kurHesabi(){
		
	}
	@Override
	public double getHesaptakiparamiktari() {
		return hesaptakiparamiktari;
	}
	@Override
	public void setHesaptakiparamiktari(double hesaptakiparamiktari) {
		this.hesaptakiparamiktari = hesaptakiparamiktari;
	}
	@Override
	public int getHesapnumarasi() {
		return hesapnumarasi;
	}

	public void setHesapnumarasi(int hesapnumarasi) {
		this.hesapnumarasi = hesapnumarasi;
	}

	public int getMusterinumarasi() {
		return musterinumarasi;
	}

	public void setMusterinumarasi(int musterinumarasi) {
		this.musterinumarasi = musterinumarasi;
	}

}
