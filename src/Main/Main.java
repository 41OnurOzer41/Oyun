package Main;

import entity.Oyuncu;
import manager.KampanyaManager;
import manager.SatisManager;
import manager.YeniUyeManager;

public class Main {

	public static void main(String[] args) {
		Oyuncu oyuncu = new Oyuncu(1,"Onur Özer" ,1234567891, 2001);
		YeniUyeManager yeniuye = new YeniUyeManager(new KullaniciDogrulama());
		yeniuye.oyuncuEkle(oyuncu);
		yeniuye.oyuncuSil(oyuncu);
		yeniuye.oyuncuGuncelle(oyuncu);
		Oyuncu oyuncu1 = new Oyuncu(2,"Emre Özer",1876543210,1998);
		SatisManager satis = new SatisManager();
		satis.oyunSatinAl(oyuncu1);
		satis.oyunSat(oyuncu1);
		satis.oyunGüncelle(oyuncu1);
		KampanyaManager kampanya = new KampanyaManager();
		kampanya.kampanyaBasladi();
		kampanya.kampanyaBitti();
		kampanya.kampanyaGüncellendi();

	}


	}

