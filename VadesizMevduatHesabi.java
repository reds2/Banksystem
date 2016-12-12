package systemofbank;

public class VadesizMevduatHesabi extends Hesap {
	
	private double hesaptakiparamiktari;
	private int hesapnumarasi;
	private int musterinumarasi;
	
	
	public VadesizMevduatHesabi(int musterino) {
		this.setHesapnumarasi((int)(Math.random()*Math.pow(10,11)));
		this.setHesaptakiparamiktari(0);
		this.setMusterinumarasi(musterino);
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
