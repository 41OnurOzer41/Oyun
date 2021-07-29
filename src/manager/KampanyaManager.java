package manager;



public class KampanyaManager extends OyuncuManager{

	@Override
	public void kampanyaBasladi() {
		System.out.println("<<<<<Kampanya Ba�lad�>>>>>");
		super.kampanyaBasladi();
	}

	@Override
	public void kampanyaBitti() {
		System.out.println(">>>>>Kampanya Bitti<<<<<");
		super.kampanyaBitti();
	}

	@Override
	public void kampanyaG�ncellendi() {
		System.out.println("!!! Kampanya G�ncellendi !!!");
		super.kampanyaG�ncellendi();
	}
}