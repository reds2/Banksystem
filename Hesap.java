package systemofbank;

public abstract class Hesap {
	public abstract void hesabaYatırım(double para);
	public abstract void hesaptanCekim(double para);
	public abstract void kurHesabi();
	public abstract void setHesaptakiparamiktari(double hesaptakiparamiktari);
	public abstract double getHesaptakiparamiktari();
	public abstract int getHesapnumarasi(); 
	
}
