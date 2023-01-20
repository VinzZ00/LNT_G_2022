package pert6;

import java.time.LocalDateTime;

public class Ticket {

	private LocalDateTime startdt, endDate;

	public Ticket() {
		super();
		this.startdt = LocalDateTime.now();
		this.endDate = LocalDateTime.now().plusDays(3);
	}

	public LocalDateTime getStartdt() {
		return startdt;
	}

	public void setStartdt(LocalDateTime startdt) {
		this.startdt = startdt;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	
	
	
	

}
