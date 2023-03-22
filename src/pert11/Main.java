package pert11;

public class Main {

	Thread t1, t2;
	public Main() {
		// TODO Auto-generated constructor stube
		t2 = new threadClass();
		t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("The name of the user thread is " + Main.this.t1.getName());
				
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("t1 has run for " + (i+1));
				}
				
				System.out.println(t1.getName() + " has done executing");
			}
		});
		
		System.out.println(t1.isDaemon() ? "is a deamon" : "isn't deamon");
		System.out.println(t1.getPriority()); // default priority dari thread user 5;
		
//		t1.setPriority(Thread.MAX_PRIORITY); // Belom kepake
//		t2.setDaemon(true);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("priority after changes " + t1.getPriority());
		System.out.println("t2 is a " + (t2.isDaemon() ? "Daemon Thread" : "user thread"));
		
		t1.start();
		
		try {
			t1.join(1000);
			t2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new Main();
		System.out.println("the name of the deamon thread in this class is " + Thread.currentThread().getName());
//		Thread t2 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("hello");
//			}
//		});
//		t2.setDaemon(true);
//		System.out.println("Testing the name of the thread in this class is " + t2.isDaemon());
//		while (true) {
//			System.out.println("testing");
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}

}
