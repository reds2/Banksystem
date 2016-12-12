package systemofbank;
import java.util.ArrayList;

public class Musteri extends Islemler {
	
	private int musterinumarasi;
	private ArrayList<IslemOzeti> yapilanislemler = new ArrayList<IslemOzeti>();
	private ArrayList<Hesap> hesaplar = new ArrayList<Hesap>();

	private ArrayList<Kart> kartlar = new ArrayList<Kart>();
	private Islemler islemler;
	
//Structure
//******************************************************************************************************
	
	
	public Musteri(){
		
		this.setMusterinumarasi((int)(Math.random()*Math.pow(10,8)));
	}
//*******************************************************************************************************
		
//getter
//*******************************************************************************************************
	public int getMusterinumarasi() {
		return musterinumarasi;
	}
	public Islemler getIslemler() {
		return islemler;
	}
	public ArrayList<Hesap> getHesaplar() {
		return hesaplar;
	}
	public ArrayList<Kart> getKartlar() {
		return kartlar;
	}
	public ArrayList<IslemOzeti> getYapilanislemler() {
		return yapilanislemler;
	}
	
//*******************************************************************************************************
	
//Setter
//*******************************************************************************************************
	public void setMusterinumarasi(int musterinumarasi) {
		this.musterinumarasi = musterinumarasi;
	}
	public void setIslemler(Islemler islemler) {
		this.islemler = islemler;
	}
	public void addHesaplar(Hesap hesap) {
		this.hesaplar.add(hesap);
	}
	public void addKartlar(Kart kart) {
		this.kartlar.add(kart);
	}
	public void addYapilanislemler(IslemOzeti yapilanislemler) {
		this.yapilanislemler.add(yapilanislemler);
	}
//*******************************************************************************************************
	
//Functions
//*******************************************************************************************************
	@Override
	public Hesap hesapNumarasınaGoreHesapBelirleme(int hesapno){
		int arananarrayelemani=0;
		for(int index=0;index<this.getHesaplar().size();index++){
			if(this.getHesaplar().get(index).getHesapnumarasi()==hesapno){
				arananarrayelemani=index;
			}
		}
		return (Hesap)this.getHesaplar().get(arananarrayelemani);
	}
	
	@Override
	public void vadeliMevduatHesabiAcma(Musteri musteri) {
		VadeliMevduatHesabi acilacakhesap = new VadeliMevduatHesabi(musteri.getMusterinumarasi());
		musteri.addHesaplar(acilacakhesap);
	}
	
	@Override
	public void bankaKartiTalebi(Musteri musteri, int hesapno) {
		BankaKarti talepedilenkart = new BankaKarti(musteri.hesapNumarasınaGoreHesapBelirleme(hesapno));
		musteri.addKartlar(talepedilenkart);
	}

	@Override
	public void krediKartiTalebi(Musteri musteri, double limit) {
		KrediKarti talepedilenkredikarti = new KrediKarti(musteri.getMusterinumarasi(), limit);
		musteri.addKartlar(talepedilenkredikarti);
	}

	@Override
	public void hesabaParaYatırma(Hesap hesap, double para) {
		double guncelbakiye=hesap.getHesaptakiparamiktari();
		guncelbakiye+=para;
		hesap.setHesaptakiparamiktari(guncelbakiye);
		System.out.printf("%.2f tl miktar hesabınıza yatırılmıştır. Hesabınızda %.2f tl vardır.\n",guncelbakiye,hesap.getHesaptakiparamiktari());
		Tarih tarih =new Tarih();
		IslemOzeti islem = new IslemOzeti("Hesaba para yatırma.", hesap.getHesapnumarasi(), tarih, hesap.getHesapnumarasi(),para);
		this.addYapilanislemler(islem);
	}

	@Override
	public void hesaptanParaCekme(Hesap hesap, double para) {
		double guncelbakiye=hesap.getHesaptakiparamiktari();
		guncelbakiye-=para;
		hesap.setHesaptakiparamiktari(guncelbakiye);
		System.out.printf("%.2f tl miktar hesabınızdan çkilmştir. Hesabınızda %.2f tl vardır.\n",guncelbakiye,hesap.getHesaptakiparamiktari());
		Tarih tarih =new Tarih();
		IslemOzeti islem = new IslemOzeti("Hesaptan para çekme.", hesap.getHesapnumarasi(), tarih, hesap.getHesapnumarasi(),para);
		this.addYapilanislemler(islem);
	}

	@Override
	public void havale(Hesap alicihesabi, Hesap gonderenhesabi, double para) {
		double gonderenguncelbakiye = gonderenhesabi.getHesaptakiparamiktari();
		gonderenguncelbakiye-=para;
		gonderenhesabi.setHesaptakiparamiktari(gonderenguncelbakiye);
	
		double aliciguncelbakiye = alicihesabi.getHesaptakiparamiktari();
		aliciguncelbakiye+=para;
		alicihesabi.setHesaptakiparamiktari(aliciguncelbakiye);
	
		System.out.printf("%d numaralı hesapa %d numaralı hesabınızdan %.2f tl aktarılmıştır. Kartınız da %.2f tl vardır.\n",alicihesabi.getHesapnumarasi(),gonderenhesabi.getHesapnumarasi(),para,gonderenhesabi.getHesaptakiparamiktari());
		Tarih tarih =new Tarih();
		IslemOzeti islem = new IslemOzeti("Hesaba para havalesi.",alicihesabi.getHesapnumarasi(),tarih,gonderenhesabi.getHesapnumarasi() ,para);
		this.addYapilanislemler(islem);
	}

	@Override
	public void vadesizMevduatHesabiAcma(Musteri musteri) {
		VadesizMevduatHesabi acilacakhesap = new VadesizMevduatHesabi(musteri.getMusterinumarasi());
		musteri.addHesaplar(acilacakhesap);
		
	}

}
//***********************************************************************************************************