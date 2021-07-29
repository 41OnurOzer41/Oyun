package manager;



public class KampanyaManager extends OyuncuManager{

	@Override
	public void kampanyaBasladi() {
		System.out.println("<<<<<Kampanya Başladı>>>>>");
		super.kampanyaBasladi();
	}

	@Override
	public void kampanyaBitti() {
		System.out.println(">>>>>Kampanya Bitti<<<<<");
		super.kampanyaBitti();
	}

	@Override
	public void kampanyaGüncellendi() {
		System.out.println("!!! Kampanya Güncellendi !!!");
		super.kampanyaGüncellendi();
	}
}