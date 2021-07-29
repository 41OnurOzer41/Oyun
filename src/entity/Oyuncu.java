package entity;
public class Oyuncu {

		private int id;
		private String adSoyad;
		private int tcNo;
		private int dogumYili;
		
		
		public Oyuncu() {
		}

		public Oyuncu(int id, String adSoyad, int tcNo, int dogumYili) {
			this.id = id;
			this.adSoyad = adSoyad;
			this.tcNo = tcNo;
			this.dogumYili = dogumYili;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAdSoyad() {
			return adSoyad;
		}
		public void setAdSoyad(String adSoyad) {
			this.adSoyad = adSoyad;
		}
		public int getTcNo() {
			return tcNo;
		}
		public void setTcNo(int tcNo) {
			this.tcNo = tcNo;
		}
		public int getDogumYili() {
			return dogumYili;
		}
		public void setDogumYili(int dogumYili) {
			this.dogumYili = dogumYili;
		}
		
	}


