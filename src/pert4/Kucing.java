package pert4;

import pert4ObjectPack.Hewan;

public class Kucing extends Hewan {

	private int jumlahSetCakar;

	public Kucing(int jumlahKaki, int umurHewan, String berkembangBiak, int jumlahSetCakar) {
		super(jumlahKaki, umurHewan, berkembangBiak);
		this.jumlahSetCakar = jumlahSetCakar;
	}

	public int getJumlahSetCakar() {
		return jumlahSetCakar;
	}

	public void setJumlahSetCakar(int jumlahSetCakar) {
		this.jumlahSetCakar = jumlahSetCakar;
	}
	
	public void suara() {
		System.out.println("Meow Meow");
	}
	

	
	

}
