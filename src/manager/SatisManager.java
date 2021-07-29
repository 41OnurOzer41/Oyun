package manager;

import entity.Oyuncu;

public class SatisManager extends OyuncuManager{

	@Override
	public void oyunSatinAl(Oyuncu oyuncu) {
		System.out.println("Oyuncu Oyunu Sat�n Ald� -->"+oyuncu.getAdSoyad());
		super.oyunSatinAl(oyuncu);
	}

	@Override
	public void oyunSat(Oyuncu oyuncu) {
		System.out.println("Oyuncu Oyunu Satt� -->"+oyuncu.getAdSoyad());
		super.oyunSat(oyuncu);
	}

	@Override
	public void oyunG�ncelle(Oyuncu oyuncu) {
		System.out.println("Oyuncu Oyunu G�ncelledi -->"+oyuncu.getAdSoyad());
		super.oyunG�ncelle(oyuncu);
	}

}