package pert11;

public class threadClass extends Thread{

	public threadClass() {
		// TODO Auto-generated constructor stub
		this.setName("thread Class");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			System.out.println(threadClass.this.getName() +" sleep 1 second");
		}
	}
	
}
