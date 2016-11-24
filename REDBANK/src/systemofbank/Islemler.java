package systemofbank;
import java.util.ArrayList;
public class Islemler {
	
	private int isleminhesapno;
	private ArrayList<IslemOzeti> yapilanislemler = new ArrayList<IslemOzeti>();

//Constructors
//***********************************************************************************************************
	public Islemler(int isleminhesapno){
		
		this.setIsleminhesapno(isleminhesapno);
		
	}

//Functions
//***********************************************************************************************************
	public void hesabaParaYatırma(Hesap hesap,double para){
	double guncelbakiye=hesap.getHesaptakiparamiktari();
	guncelbakiye+=para;
	hesap.setHesaptakiparamiktari(guncelbakiye);
	System.out.printf("%.2f tl miktar hesabınıza yatırılmıştır. Hesabınızda %.2f tl vardır.\n",guncelbakiye,hesap.getHesaptakiparamiktari());
	Tarih tarih =new Tarih();
	IslemOzeti islem = new IslemOzeti("Hesaba para yatırma.", this.getIsleminhesapno(), tarih, hesap.getHesapnumarasi(),para);
	this.addYapilanislemler(islem);
	}

	public void hesaptanParaCekme(Hesap hesap,double para){
		double guncelbakiye=hesap.getHesaptakiparamiktari();
		guncelbakiye-=para;
		hesap.setHesaptakiparamiktari(guncelbakiye);
		System.out.printf("%.2f tl miktar hesabınızdan çkilmştir. Hesabınızda %.2f tl vardır.\n",guncelbakiye,hesap.getHesaptakiparamiktari());
		Tarih tarih =new Tarih();
		IslemOzeti islem = new IslemOzeti("Hesaptan para çekme.", this.getIsleminhesapno(), tarih, hesap.getHesapnumarasi(),para);
		this.addYapilanislemler(islem);
		}

	public void havale(Hesap alicihesabi,Hesap gonderenhesabi,double para){
	double gonderenguncelbakiye = gonderenhesabi.getHesaptakiparamiktari();
	gonderenguncelbakiye-=para;
	gonderenhesabi.setHesaptakiparamiktari(gonderenguncelbakiye);
	
	double aliciguncelbakiye = alicihesabi.getHesaptakiparamiktari();
	aliciguncelbakiye+=para;
	alicihesabi.setHesaptakiparamiktari(aliciguncelbakiye);
	
	System.out.printf("%d numaralı hesapa %d numaralı hesabınızdan %.2f tl aktarılmıştır. Kartınız da %.2f tl vardır.\n",alicihesabi.getHesapnumarasi(),gonderenhesabi.getHesapnumarasi(),para,gonderenhesabi.getHesaptakiparamiktari());
	Tarih tarih =new Tarih();
	IslemOzeti islem = new IslemOzeti("Hesaba para havalesi.", this.getIsleminhesapno(),tarih,gonderenhesabi.getHesapnumarasi() ,para);
	this.addYapilanislemler(islem);
	}
//gets
//********************************************************************************************************************
	public ArrayList<IslemOzeti> getYapilanislemler() {
		return yapilanislemler;
	}
	public int getIsleminhesapno() {
		return isleminhesapno;
	}
//sets
//********************************************************************************************************************
	public void addYapilanislemler(IslemOzeti yapilanislemler) {
		this.yapilanislemler.add(yapilanislemler);
	}

	
	public void setIsleminhesapno(int hesapno) {
		this.isleminhesapno=hesapno;
	}
}
