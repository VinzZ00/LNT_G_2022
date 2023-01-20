package pert6;

import java.time.LocalDateTime;

public class Pengunjung {

	private String nama, alamat, email;
	private double tinggiBadan;
	private Ticket ticket;
	
	public Pengunjung(String nama, String alamat, String email, double tinggiBadan) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.email = email;
		this.tinggiBadan = tinggiBadan;
		
		System.out.println("Pendaftaran Pengguna sudah berhasil, silahkan coba generate ticket anda");
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getTinggiBadan() {
		return tinggiBadan;
	}

	public void setTinggiBadan(double tinggiBadan) {
		this.tinggiBadan = tinggiBadan;
	}
	
	public void generateTicket() throws Exception {
		if (this.tinggiBadan >= 150) {
			this.ticket = new Ticket();
			System.out.println("Your ticket will expire in 3 days starting from today. Exp : " + ticket.getEndDate());
		} else {
			Exception tidakCukupTinggi = new Exception("Come Back Next Year");
			System.out.println("You are not eligible to play in dufan");
			throw tidakCukupTinggi;
		}
	}
	
	public void ride() {
		if (LocalDateTime.now().isBefore(ticket.getEndDate())  ) {
			System.out.println("Becareful With your ride ");
			System.out.println("Ticket Expiration is before " + ticket.getEndDate().toString());
		}
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	 

}
