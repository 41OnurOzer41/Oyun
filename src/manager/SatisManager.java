package manager;

import entity.Oyuncu;

public class SatisManager extends OyuncuManager{

	@Override
	public void oyunSatinAl(Oyuncu oyuncu) {
		System.out.println("Oyuncu Oyunu Satýn Aldý -->"+oyuncu.getAdSoyad());
		super.oyunSatinAl(oyuncu);
	}

	@Override
	public void oyunSat(Oyuncu oyuncu) {
		System.out.println("Oyuncu Oyunu Sattý -->"+oyuncu.getAdSoyad());
		super.oyunSat(oyuncu);
	}

	@Override
	public void oyunGüncelle(Oyuncu oyuncu) {
		System.out.println("Oyuncu Oyunu Güncelledi -->"+oyuncu.getAdSoyad());
		super.oyunGüncelle(oyuncu);
	}

}