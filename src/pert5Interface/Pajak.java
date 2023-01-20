package pert5Interface;

public class Pajak {

	Double penghasilanJT;
	interface1 kalkulasiPajak;
	
	public Pajak() {
		
	}
	
	public void initPajak(double penghasilan) {
		// TODO Auto-generated constructor stub
		
		if (penghasilan <= 10) {
			kalkulasiPajak = new pajak1pct();
		} else if(penghasilan <= 50) {
			kalkulasiPajak = new interface1() {
				
				@Override
				public double pajakCalc(double Penghasilan) {
					// TODO Auto-generated method stub
					return  (Penghasilan - (Penghasilan/100 * 5));
				}
			};
		} else {
			kalkulasiPajak = (p) -> {
				return (p - (p/100 * 5));
			};
		}
	}
	
	public double kalkulasiSalary(interface1 persenPajak, double salary) {
		
		return persenPajak.pajakCalc(salary);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pajak p = new Pajak();
		p.initPajak(10);
		
		double salary = p.kalkulasiSalary(p.kalkulasiPajak, 5);
		
		System.out.println("salary akhir ketika dapat gaji 5 " + salary);
		
		p.initPajak(75);
		
		System.out.println("salary akhir ketika dapat gaji 75 juta " + p.kalkulasiSalary(p.kalkulasiPajak, 75));
		
	}
}

class pajak1pct implements interface1{
	
	@Override
	public double pajakCalc(double Penghasilan) {
		// TODO Auto-generated method stub
		return (Penghasilan - (Penghasilan/100 * 1));
	}
	
}
