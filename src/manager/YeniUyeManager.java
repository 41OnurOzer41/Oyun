package manager;

import Main.KullaniciDogrulama;
import entity.Oyuncu;

public class YeniUyeManager extends OyuncuManager{

	private KullaniciDogrulama dogrulama;
	public YeniUyeManager(KullaniciDogrulama dogrulama) {
		this.dogrulama = dogrulama;
		
	}
	@Override
	public void oyuncuEkle(Oyuncu oyuncu) {
		System.out.println("Oyuncu Eklendi -->" +oyuncu.getAdSoyad());
		dogrulama.dogrula();
		super.oyuncuEkle(oyuncu);
	}

	@Override
	public void oyuncuSil(Oyuncu oyuncu) {
		System.out.println("Oyuncu Silindi -->"+oyuncu.getAdSoyad());
		super.oyuncuSil(oyuncu);
	}

	@Override
	public void oyuncuGuncelle(Oyuncu oyuncu) {
		System.out.println("Oyuncu Güncellendi -->"+oyuncu.getAdSoyad());
		super.oyuncuGuncelle(oyuncu);
	}
	
}