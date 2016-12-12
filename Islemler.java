package systemofbank;

public abstract class Islemler {
	
	public abstract void vadeliMevduatHesabiAcma(Musteri musteri);
	public abstract void vadesizMevduatHesabiAcma(Musteri musteri);
	public abstract void bankaKartiTalebi(Musteri musteri, int hesapno);
	public abstract void krediKartiTalebi(Musteri musteri,double limit);
	public abstract void hesabaParaYatırma(Hesap hesap,double para);
	public abstract void hesaptanParaCekme(Hesap hesap,double para);
	public abstract void havale(Hesap alicihesabi,Hesap gonderenhesabi,double para);
	public abstract Hesap hesapNumarasınaGoreHesapBelirleme(int hesapno);
	
}
