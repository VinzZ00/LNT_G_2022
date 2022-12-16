package pert4ObjectPack;

public abstract class Hewan {

	// public, protected, default(no access Mod), private
	public int jumlahKaki, umurHewan;
	protected String berkembangBiak;
	protected int jumlahMata;
	
	// Constructor
	public Hewan(int jumlahKaki, int umurHewan, String berkembangBiak) {
		super();
		this.jumlahKaki = jumlahKaki;
		this.umurHewan = umurHewan;
		this.berkembangBiak = berkembangBiak;
	}
	
	public Hewan() {
		
	}
	
	// Shortcut buat method getter dan setter alt + shift + s + r
	public int getJumlahKaki() {
		return jumlahKaki;
	}



	public void setJumlahKaki(int jumlahKaki) {
		this.jumlahKaki = jumlahKaki;
	}



	public int getUmurHewan() {
		return umurHewan;
	}



	public void setUmurHewan(int umurHewan) {
		this.umurHewan = umurHewan;
	}



	public String getBerkembangBiak() {
		return berkembangBiak;
	}



	public void setBerkembangBiak(String berkembangBiak) {
		this.berkembangBiak = berkembangBiak;
	}

	public int getJumlahMata() {
		return jumlahMata;
	}

	public void setJumlahMata(int jumlahMata) {
		this.jumlahMata = jumlahMata;
	}
	
	public abstract void suara();
	
	
	

}
