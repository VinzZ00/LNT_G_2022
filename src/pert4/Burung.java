package pert4;

import pert4ObjectPack.Hewan;
import pert4ObjectPack.parent;

public class Burung extends Hewan {

	private int jumlahSayap;
	
	public void suara() {
		System.out.println("Chirp - Chirp");
	}

	public Burung(int jumlahKaki, int umurHewan, String berkembangBiak, int jumlahSayap) {
		super(jumlahKaki, umurHewan, berkembangBiak);
		this.jumlahSayap = jumlahSayap;
	}

	public int getJumlahSayap() {
		return jumlahSayap;
	}

	public void setJumlahSayap(int jumlahSayap) {
		this.jumlahSayap = jumlahSayap;
	}

	
	
	
	
	

}
