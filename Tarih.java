package systemofbank;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
public class Tarih {
	
	private int yil;
	private int ay;
	private int gun;
	
//Constructor
//***************************************************************************************************************

	public Tarih(){
		
		Calendar tarih = new GregorianCalendar();
		this.setYil(tarih.get(Calendar.YEAR));
		this.setAy(tarih.get(Calendar.MONTH));
		this.setGun(tarih.get(Calendar.DAY_OF_MONTH));
		
	}
public Tarih(int day,int month,int year){
		
		this.setYil(year);
		this.setAy(month);
		this.setGun(day);
		
	}
//Functions
//*****************************************************************************************************

	public String tarihiBastir(){
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		return format.format(date);
		
	}
	
//Gets
//*********************************************************************************************************
	public int getYil() {
		return yil;
	}

	public int getAy() {
		return ay;
	}

	public int getGun() {
		return gun;
	}

	
//Sets
//******************************************************************************************************
	public void setYil(int yil) {
		this.yil = yil;
	}
	
	public void setAy(int ay) {
		this.ay = ay;
	}
	
	public void setGun(int gun) {
		this.gun = gun;
	}
}
